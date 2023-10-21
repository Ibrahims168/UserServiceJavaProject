package com.userServiceProject.controller;

import com.userServiceProject.feignClientPollService.PollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("poll-services-client")
public class PollServiceController {
    @Autowired
    private PollService pollService;

    @DeleteMapping("/delete-user-answers/{userId}")
    void getQuestionById(@PathVariable Long userId) {
        pollService.deleteAllUserAnswers(userId);
    }

}
