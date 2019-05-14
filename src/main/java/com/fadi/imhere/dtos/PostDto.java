package com.fadi.imhere.dtos;
import lombok.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;


@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class PostDto {


    private UUID id;
    private String title;
    private List<PostContentDto> postContent;
    private int viewCounter;
    private String category;
    private Date creationDate;
    private String username;
    private boolean liked;
    private int repliesCount;
    private boolean checked;
    private boolean validated;


}
