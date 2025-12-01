package ro.ghil.reviewservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewTestController {

    @GetMapping("/test")
    public String test() {
        return "Review Service is up and running!";
    }
    
}
