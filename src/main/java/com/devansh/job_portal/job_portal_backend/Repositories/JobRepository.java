package com.devansh.job_portal.job_portal_backend.Repositories;



import com.devansh.job_portal.job_portal_backend.Model.job;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface JobRepository extends JpaRepository<job, Long> {
List<job> findByTitleContainingIgnoreCase(String title);
}
