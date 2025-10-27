package com.devansh.job_portal.job_portal_backend.controller;

import com.devansh.job_portal.job_portal_backend.Model.job;
import com.devansh.job_portal.job_portal_backend.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

    @Autowired
    private JobService jobService;

    @PostMapping("/add")
    public job addJob(@RequestBody job job) {
        return jobService.saveJob(job);
    }

    @GetMapping("/all")
    public List<job> getAllJobs() {
        return jobService.getAllJobs();
    }

    @GetMapping("/{id}")
    public job getJobById(@PathVariable Long id) {
        return jobService.getJobById(id);
    }
}

