package com.devansh.job_portal.job_portal_backend.service;

import com.devansh.job_portal.job_portal_backend.Model.job;
import com.devansh.job_portal.job_portal_backend.Repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    // Save a new job
    public job saveJob(job job) {
        return jobRepository.save(job);
    }

    // Get all jobs
    public List<job> getAllJobs() {
        return jobRepository.findAll();
    }

    // Get job by ID
    public job getJobById(Long id) {
        Optional<job> job = jobRepository.findById(id);
        return job.orElse(null);
    }
}

