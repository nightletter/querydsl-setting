package me.nightletter.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@SpringBootTest
@Transactional
class MemberQueryRepositoryTest {

    @Autowired EntityManager em;
    @Autowired
    MemberQueryRepository memberQueryRepository;

    @Test
    void 실행테스트() {
        for (int i = 0; i<50; i++) {
            em.persist(new Member("member"+i,i));
        }
        em.flush();
        em.clear();

        List<Member> result = memberQueryRepository.findAll();
        for (Member member : result) {
            System.out.println("member = " + member);
        }
    }
}