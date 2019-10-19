package demo.sb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@RestController
public class GreetingController {

    @GetMapping("/greet")
    public String greet(@RequestParam(required = false) String name, HttpServletRequest request) {
        return String.format("Hello %s from %s!", Optional.ofNullable(name).orElse("World"), request.getLocalName());
    }
}
