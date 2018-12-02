package com.fadi.imhere.model;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;


@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "article")
public class Post implements Serializable {

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
