package com.shivam.interviewCoach.controller;

import com.shivam.interviewCoach.service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterviewController {

    private InterviewService service;
    public InterviewController(InterviewService service){
        this.service=service;
    }

    @GetMapping("/start")
    public String startInterview(@RequestParam String topic){
        return service.startInterview(topic);
    }
}
