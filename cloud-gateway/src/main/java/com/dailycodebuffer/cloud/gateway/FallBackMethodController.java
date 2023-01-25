package com.dailycodebuffer.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/userServiceFallBack")
    public String userServiceFallBackMethod() {
        return "User Service is taking longer than Expected." +
                " Please try again later";
    }

    @GetMapping("/manufacturerServiceFallBack")
    public String manufacturerServiceFallBackMethod() {
        return "Manufacturer Service is taking longer than Expected." +
                " Please try again later";
    }

    @GetMapping("/cropServiceFallBack")
    public String cropServiceFallBackMethod() {
        return "Crops Service is taking longer than Expected." +
                " Please try again later";
    }
    @GetMapping("/fertilizerServiceFallBack")
    public String fertilizerServiceFallBackMethod() {
        return "Fertilizers Service is taking longer than Expected." +
                " Please try again later";
    }
    @GetMapping("/cartServiceFallBack")
    public String cartServiceFallBackMethod() {
        return "CART Service is taking longer than Expected." +
                " Please try again later";
    }
}
