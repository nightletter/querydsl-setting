package me.nightletter.test;

import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberQueryRepository memberQueryRepository;
    private final EntityManager em;

    @GetMapping("/")
    public List<Member> ex() {
        return memberQueryRepository.findAll();
    }
}
