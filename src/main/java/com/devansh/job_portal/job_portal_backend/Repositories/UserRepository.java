package com.devansh.job_portal.job_portal_backend.Repositories;

import com.devansh.job_portal.job_portal_backend.Model.user;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<user, Long> {
	user findByUsername(String username);
}

