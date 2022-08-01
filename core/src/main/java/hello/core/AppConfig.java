package hello.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberRepository;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

@Configuration
public class AppConfig {

    @Bean
    MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }
    
}
