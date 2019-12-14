package com.greetings;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private final GreetingProps props;

    public GreetingController(final GreetingProps props) {
        this.props = props;
    }

    @GetMapping("/hello")
    public String message() {
        return props.getMessage();
    }
}