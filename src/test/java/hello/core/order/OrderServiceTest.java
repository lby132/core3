package hello.core.order;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberServiceImpl;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    final MemberServiceImpl memberService = new MemberServiceImpl();
    final OrderServiceImpl orderService = new OrderServiceImpl();

    @Test
    void createOrder() {
        Long memberId = 1L;
        final Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        final Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
    }

}
