package com.duongminh.email.controller;

import com.duongminh.email.service.email.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.duongminh.email.model.EmailModel;

@Controller
@RequestMapping("/index")
public class TestController {

    @Autowired
    private EmailService emailService;

    @GetMapping(value = {"", "/"})
    public String hello() {
        return "index.html";
    }

    @GetMapping(value = {"/send", "/send/"})
    public String getSendEmail() {
        return "sendEmail.html";
    }

    @PostMapping(value = {"/send", "/send/"})
    public String sendEmail(@ModelAttribute EmailModel email, Model model) {

        emailService.sendSimpleMessage(email.getTo(), email.getSubject(), email.getContent());

        model.addAttribute("name", email.getTo());
        return "success.html";
    }

}
