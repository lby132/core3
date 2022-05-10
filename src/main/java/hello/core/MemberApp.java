package hello.core;

import hello.core.member.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {

    public static void main(String[] args) {

//        final AppConfig appConfig = new AppConfig();
//        final MemberService memberService = appConfig.memberService();

        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        final MemberService memberService = ac.getBean("memberService", MemberService.class);

        final Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        final Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find Member = " + findMember.getName());

    }
}
