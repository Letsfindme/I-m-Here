package com.fadi.imhere.model;

import lombok.*;
import org.hibernate.annotations.Type;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "post_contents")
public class PostContent implements Serializable {

    @Id
    @Type(type="uuid-char")
    @Column(name = "id")
    @GeneratedValue
    private UUID id;

    @Column(name = "title")
    private String title;

    @Column(name = "text")
    private String text;

    @Column(name = "video_url")
    private String videoMUrl;

    @OneToOne
    @JoinColumn(name = "post_id")
    private Post post;


}
