package com.duongminh.email.service.email;

import org.springframework.web.multipart.MultipartFile;

import javax.mail.MessagingException;

public interface EmailService {

    void sendSimpleMessage(String to, String subject, String content);

    void sendEmailWithAttachment(String to, String subject, String content, MultipartFile file) throws MessagingException;

}