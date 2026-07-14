package com.shivam.interviewCoach.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class InterviewService {

    private ChatClient chatClient;
    public InterviewService(ChatClient.Builder builder){
        this.chatClient=builder.build();
    }

    //actual behaviour:
    //start interview method :
    public String startInterview(String topic){
       return chatClient.prompt().system("Im a ai Interviewer")
                .user(topic)
                .call()
                .content();

    }
}
