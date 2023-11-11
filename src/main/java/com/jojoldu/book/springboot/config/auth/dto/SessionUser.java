package com.jojoldu.book.springboot.config.auth.dto;

import com.jojoldu.book.springboot.domain.user.User1;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(User1 user1) {
        this.name = user1.getName();
        this.email = user1.getEmail();
        this.picture = user1.getPicture();
    }
}