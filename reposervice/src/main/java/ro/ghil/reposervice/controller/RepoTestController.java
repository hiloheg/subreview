package ro.ghil.reposervice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/repositories")
public class RepoTestController {

    @GetMapping("/test")
    public String test() {
        return "Repository Service is up and running!";
    }

}
