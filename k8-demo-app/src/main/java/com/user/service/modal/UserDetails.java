package com.user.service.modal;

import jakarta.persistence.*;
import lombok.Data;

import javax.annotation.processing.Generated;
import java.io.Serializable;

@Entity
@Data
public class UserDetails implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;
}
