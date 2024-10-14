package com.redesocial.redesocial.controllers;

import com.redesocial.redesocial.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class SignUpController {
    @RequestMapping("/signup")
    public String signUp() {
        return "signup";
    }
}
