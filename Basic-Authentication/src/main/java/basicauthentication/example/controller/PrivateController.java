package basicauthentication.example.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secret")
public class PrivateController {

    @GetMapping
    public String helloPrivate() {
        return "Hello! from secret area";
    }
    @GetMapping("/user")
    public String helloUserPrivate() {
        return "Hello! from user secret area";
    }
    @GetMapping("/admin")
    public String helloAdminPrivate() {
        return "Hello! from admin secret area";
    }
}
