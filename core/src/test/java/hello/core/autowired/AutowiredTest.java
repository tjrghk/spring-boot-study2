package hello.core.autowired;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.lang.Nullable;

import hello.core.member.Member;

public class AutowiredTest {
    
    @Test
    void AutowiredOption() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);
    }

    static class TestBean {

        @Autowired(required = false)
        public void setNoBean1(Member noBeas1) {
            System.out.println("noBeas1 = " + noBeas1);
        }

        @Autowired
        public void setNoBean2(@Nullable Member noBeas2) {
            System.out.println("noBeas2 = " + noBeas2);
        }

        @Autowired
        public void setNoBean3(Optional<Member> noBeas3) {
            System.out.println("noBeas3 = " + noBeas3);
        }
    }
}
