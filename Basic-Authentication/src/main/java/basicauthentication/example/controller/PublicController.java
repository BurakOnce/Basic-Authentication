package basicauthentication.example.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/free")
public class PublicController {
    @GetMapping
    public String hello() {
        return "Hello! from free area";
    }

}
