package com.userServiceProject.feignClientPollService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "PollService",
        url = "${pollService.url}"
)
public interface PollService {
    @DeleteMapping("/delete-user-answers/{userId}")
    void deleteAllUserAnswers(@PathVariable Long userId);

}
