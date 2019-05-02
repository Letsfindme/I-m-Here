package com.fadi.imhere.model;

import lombok.*;
import org.hibernate.annotations.Type;
import javax.persistence.*;
import java.util.Date;
import java.util.UUID;
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "comment_likes")
public class CommentLike {

    @Id
    @Type(type="uuid-char")
    @Column(name = "id")
    @GeneratedValue
    private UUID id;

    @Column(name = "\"date\"")
    private Date date;

    @OneToOne
    @JoinColumn(name = "comment_id")
    private Comment comment;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;



}
