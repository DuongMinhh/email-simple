package com.duongminh.email.service.email;

public interface EmailService {

    void sendSimpleMessage(String to, String subject, String content);

}