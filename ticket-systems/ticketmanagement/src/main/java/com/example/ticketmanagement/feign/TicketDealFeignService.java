package com.example.ticketmanagement.feign;

import com.example.ticketdb.bean.User;
import feign.hystrix.FallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "ticketdeal"/*,fallbackFactory = TicketDealFeignService.TicketDealFeginFactory.class*/)
public interface TicketDealFeignService {
    /**
     * 。
     * @param loginName
     * @return
     */
    @PostMapping("/user/getUserByLoginName")
    User getUserByLoginName(String loginName);

//    @Component
//    class TicketDealFeginFactory implements FallbackFactory<TicketDealFeignService> {
//
//
//        /**
//         * feign名称。
//         */
//        private final String feignName = "ticketdeal";
//
//        @Override
//        public TicketDealFeignService create(Throwable throwable) {
//            return new TicketDealFeignServiceImpl(throwable, feignName);
//        }
//    }
//    class TicketDealFeignServiceImpl implements TicketDealFeignService {
//        private final Throwable throwable;
//
//        /**
//         * feign名称。
//         */
//        private final String feignName;
//        public TicketDealFeignServiceImpl(Throwable throwable, String feignName) {
//            this.throwable = throwable;
//            this.feignName = feignName;
//        }
//
//        @Override
//        public User getUserByLoginName(String loginName) {
//            return null;
//        }
//    }
}
