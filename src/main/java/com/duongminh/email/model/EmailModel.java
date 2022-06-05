package com.duongminh.email.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmailModel {

    private String to;
    private String subject;
    private String content;

}
