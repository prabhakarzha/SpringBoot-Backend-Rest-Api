package com.blog.blogappapis.models;
import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name="users")
@NoArgsConstructor
@Setter
@Getter
public class User {
     
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private int id;

    @Column(name="user_name", nullable=false,length=100)
    private String name;
    private String email;
    private String password;
    private String about;
    
}
