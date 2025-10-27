package com.devansh.job_portal.job_portal_backend.Repositories;

import com.devansh.job_portal.job_portal_backend.Model.application;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface ApplicationRepository extends JpaRepository<application, Long> {
	List<application> findByUserId(Long userId);
	List<application> findByJobId(Long jobId);
}
