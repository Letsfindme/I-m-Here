package com.fadi.imhere.model;

import lombok.*;
import org.hibernate.annotations.Type;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "comments")
public class Comment implements Serializable {

    private static final long serialVersionUID = 3650686048090860600L;

    @Id
    @Type(type="uuid-char")
    @Column(name = "id")
    @GeneratedValue
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


}
