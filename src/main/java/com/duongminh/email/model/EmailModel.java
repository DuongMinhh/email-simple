package com.duongminh.email.model;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmailModel {

    private String to;
    private String subject;
    private String content;

    private MultipartFile file;

}
