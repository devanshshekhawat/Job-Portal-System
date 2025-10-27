package com.devansh.job_portal.job_portal_backend.service;


import com.devansh.job_portal.job_portal_backend.Model.application;
import com.devansh.job_portal.job_portal_backend.Repositories.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;

    // Save new application
    public application saveApplication(application application) {
        return applicationRepository.save(application);
    }

    // Get all applications
    public List<application> getAllApplications() {
        return applicationRepository.findAll();
    }

    // Get applications by user ID
    public List<application> getApplicationsByUserId(Long userId) {
        return applicationRepository.findByUserId(userId);
    }

    // Get applications by job ID
    public List<application> getApplicationsByJobId(Long jobId) {
        return applicationRepository.findByJobId(jobId);
    }
}

