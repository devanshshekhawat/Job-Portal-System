package com.devansh.job_portal.job_portal_backend.controller;

import com.devansh.job_portal.job_portal_backend.Model.application;
import com.devansh.job_portal.job_portal_backend.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/applications")
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    @PostMapping("/apply")
    public application applyForJob(@RequestBody application application) {
        return applicationService.saveApplication(application);
    }

    @GetMapping("/all")
    public List<application> getAllApplications() {
        return applicationService.getAllApplications();
    }

    @GetMapping("/user/{userId}")
    public List<application> getApplicationsByUser(@PathVariable Long userId) {
        return applicationService.getApplicationsByUserId(userId);
    }

    @GetMapping("/job/{jobId}")
    public List<application> getApplicationsByJob(@PathVariable Long jobId) {
        return applicationService.getApplicationsByJobId(jobId);
    }
}

