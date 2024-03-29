package com.ll.medium_correct.domain.member.member.controller;


import com.ll.medium_correct.domain.member.member.entity.Member;
import com.ll.medium_correct.domain.member.member.repository.MemberRepository;
import com.ll.medium_correct.domain.member.member.service.MemberService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/join")
    public String showjoin(){
        return "domain/member/member/join";
    }

    @Setter
    @Getter
    public static class JoinForm{
        @NotBlank
        private String username;
        @NotBlank
        private String password;
    }

    @PostMapping("/join")
    public String join(@Valid JoinForm joinForm){
       Member member =  memberService.join(joinForm.getUsername(), joinForm.getPassword());
        long id = member.getId();

        return "redirect:/?msg=No %d member joined".formatted(id);
    }
}
