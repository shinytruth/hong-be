package com.lguplus.hong.user.repository;

import com.lguplus.hong.user.entity.Member;
import com.lguplus.hong.user.entity.Silver;
import com.lguplus.hong.user.entity.Staff;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;


@SpringBootTest
@Transactional
@Disabled
class MemberRepositoryTest {


    @Autowired
    MemberRepository memberRepository;

    @Autowired
    SilverRepository silverRepository;

    @Autowired
    StaffRepository staffRepository;

    @Test
    @Rollback(false)
    void createMember() {

        memberRepository.save(new Member("홍일동", "010-1234-5678", "서울시 개화동"));
        memberRepository.save(new Member("홍이동", "010-1234-5678", "서울시 목동"));
        memberRepository.save(new Member("홍삼동", "010-1234-5678", "서울시 도봉동"));
        memberRepository.save(new Member("홍사동", "010-1234-5678", "서울시 당산동"));

    }


    @Test
    @Rollback(false)
    void createSilver() {

        silverRepository.save(new Silver("홍일동 어머니", "010-1234-5678", "서울시", 1L));
        silverRepository.save(new Silver("홍이동 어머니", "010-1234-5678", "서울시", 2L));
        silverRepository.save(new Silver("홍삼동 어머니", "010-1234-5678", "서울시", 3L));
        silverRepository.save(new Silver("홍사동 어머니", "010-1234-5678", "서울시", 4L));
    }


    @Test
    @Rollback(false)
    void createHong() {

        staffRepository.save(new Staff("홍반장01", "H", "5.0"));
        staffRepository.save(new Staff("홍반장02", "H", "4.3"));
        staffRepository.save(new Staff("홍반장03", "H", "4.7"));
        staffRepository.save(new Staff("홍반장04", "H", "3.0"));

    }
}