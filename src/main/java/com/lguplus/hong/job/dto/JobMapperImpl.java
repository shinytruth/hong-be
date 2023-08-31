package com.lguplus.hong.job.dto;

import com.lguplus.hong.job.entity.Category;
import com.lguplus.hong.job.entity.Job;
import com.lguplus.hong.job.repository.CategoryRepository;
import com.lguplus.hong.user.entity.Member;
import com.lguplus.hong.user.entity.Silver;
import com.lguplus.hong.user.entity.Staff;
import com.lguplus.hong.user.repository.MemberRepository;
import com.lguplus.hong.user.repository.SilverRepository;
import com.lguplus.hong.user.repository.StaffRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class JobMapperImpl implements JobMapper {

    private final CategoryRepository categoryRepository;
    private final MemberRepository memberRepository;
    private final StaffRepository staffRepository;
    private final SilverRepository silverRepository;

    public JobDetailDTO mapToJobDetail(Job job) {
        Category category = categoryRepository.findById(job.getCategoryId()).get();
        String categoryName = category.getName();

        Member member = memberRepository.findById(job.getMemberId()).get();
        String memberName = member.getName();
        String memberPhoneNumber = member.getPhoneNumber();

        Silver silver = silverRepository.findById(job.getSilverId()).get();
        String silverPhoneNumber = silver.getPhoneNumber();

        String hongName = "";
        if (job.getHongId() != null) {
            Optional<Staff> staff = staffRepository.findById(job.getHongId());
            if (staff.isPresent()) {
                hongName = staff.get().getName();
            }
        }

        var status = job.getStatus() == "R" ? "요청" : job.getStatus() == "P" ? "진행중" : "완료";

        return JobDetailDTO.builder()
            .jobId(job.getId())
            .memberName(memberName)
            .categoryName(categoryName)
            .hongName(hongName)
            .content(job.getContent())
            .requestAddress(job.getRequestAddress())
            .requestTime(job.getRequestTime())
            .silverPhoneNumber(silverPhoneNumber)
            .memberPhoneNumber(memberPhoneNumber)
            .status(status)
            .build();
    }

}
