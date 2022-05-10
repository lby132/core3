package hello.core;

import hello.core.member.*;

public class MemberApp {

    public static void main(String[] args) {

        final AppConfig appConfig = new AppConfig();
        final MemberService memberService = appConfig.memberService();
        final Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        final Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find Member = " + findMember.getName());

    }
}
