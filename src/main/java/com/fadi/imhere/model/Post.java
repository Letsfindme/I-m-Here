package com.fadi.imhere.model;


import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "posts")
public class Post implements Serializable {

    @Id
    @Type(type="uuid-char")
    @Column(name = "id")
    @GeneratedValue
    private UUID id;

    @Column(name = "title", length = 32)
    private String title;

    @OneToMany
    @Column(name = "content", length = 1024)
    private List<PostContent> contents;

    @Column(name = "view_count")
    private int viewCounter;

    @Column(name = "category", length = 32)
    private String category;

    @Column(name = "creation_date")
    private Date creationDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "post_id")
    private List<PostLike> postLikes;

    @OneToMany(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "comments")
    private List<Comment> comments;
}
