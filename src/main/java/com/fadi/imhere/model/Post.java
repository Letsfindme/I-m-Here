package com.fadi.imhere.model;


import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
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
    @Column(name = "id", columnDefinition = "RAW(16)")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @GeneratedValue(generator = "uuid2")
    private UUID id;

    @Column(name = "title",nullable = false, length = 32)
    private String title;

    @Column(name = "content",nullable = false, length = 1024)
    private String content;

    @Column(name = "view_count")
    private int viewCounter;

    @Column(name = "category",nullable = false, length = 32)
    private String category;

    @Column(name = "creation_date")
    private Date creationDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "post_id", nullable = false, insertable = false, updatable = false)
    private List<PostLike> postLikes;

    @OneToMany(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "related_post", nullable = false, insertable = false, updatable = false)
    private List<Post> replies;
}
