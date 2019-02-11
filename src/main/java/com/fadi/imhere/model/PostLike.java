package com.fadi.imhere.model;
import com.fadi.imhere.Utils.ObjectUtils;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "post_likes")
public class PostLike {

    @Id
    @Column(name = "id", columnDefinition = "RAW(16)")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @GeneratedValue(generator = "uuid2")
    private UUID id;

    @Column(name = "\"date\"")
    private Date date;

    @OneToOne
    @JoinColumn(name = "post_id")
    private Post post;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    public PostLike() {
    }

    public PostLike(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getDate() {
        return ObjectUtils.cloneDate(date);
    }

    public void setDate(Date date) {
        this.date = ObjectUtils.cloneDate(date);
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
