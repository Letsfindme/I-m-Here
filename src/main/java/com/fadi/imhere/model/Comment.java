package com.fadi.imhere.model;
import com.fadi.imhere.Utils.ObjectUtils;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "comments")
public class Comment implements Serializable {

    private static final long serialVersionUID = 3650686048090860600L;

    @Id
    @Column(name = "id", columnDefinition = "RAW(16)")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @GeneratedValue(generator = "uuid2")
    private UUID id;

    @Column(name = "content")
    private String content;

    @Column(name = "last_modified")
    private Date lastModified;

    @OneToOne
    @JoinColumn(name = "post_id")
    private Post post;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "checked")
    private Boolean checked;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getLastModified() {
        return ObjectUtils.cloneDate(lastModified);
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = ObjectUtils.cloneDate(lastModified);
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

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }
}
