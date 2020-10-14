package com.example.ticketgateway.filter;

import com.example.ticketdb.bean.User;
import com.example.ticketgateway.config.AccessUriProperties;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.StringUtils;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Set;

/**
 * 。
 *
 * @author 卢宏政
 */
@Component
public class TokenFilter implements GlobalFilter {

    @Autowired
    private AccessUriProperties accessUriProperties;

    @Autowired
    private CacheManager cacheManager;

    private final AntPathMatcher matcher = new AntPathMatcher();

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest request = exchange.getRequest();
        String path = request.getURI().getPath();
        if(whitePath(path)){
            return chain.filter(exchange);
        }else{
            String userId = request.getHeaders().getFirst("user_id");
            User user = cacheManager.getCache("user").get(userId, User.class);
            if(user != null){
                return chain.filter(exchange);
            }else{
                throw new RuntimeException("缺少userId");
            }
        }
    }

    private boolean whitePath(String path) {
        boolean flag = false;
        Set<String> noneTokens = accessUriProperties.getNoneTokens();
        for (String uri:noneTokens){
            if(path.matches(uri)){
                flag = true;
                break;
            }
        }
        return flag;
    }
}
