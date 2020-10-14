package com.example.ticketgateway.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * 黑白URI的配置项
 *
 * @author zhanghaoran
 */
@Component
@ConfigurationProperties(prefix = "access.uri")
public class AccessUriProperties {

    /**
     * tokenFilter不拦截路径
     */
    private Set<String> noneTokens;

    /**
     * 禁止访问的uri 如：actuator
     */
    private Set<String> blacks;

    public Set<String> getNoneTokens() {
        return noneTokens;
    }

    public void setNoneTokens(Set<String> noneTokens) {
        this.noneTokens = noneTokens;
    }

    public Set<String> getBlacks() {
        return blacks;
    }

    public void setBlacks(Set<String> blacks) {
        this.blacks = blacks;
    }
}
