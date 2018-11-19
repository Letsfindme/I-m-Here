package com.fadi.imhere.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;


@Setter
@Getter


@Entity
@Table(name = "article")
public class Article {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, length = 32)
    private String title;

    @Column(nullable = false, length = 1024)
    private String content;

    @Column(nullable = false, length = 32)
    private String category;

    private LocalDateTime createdDated;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
}
