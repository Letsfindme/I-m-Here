package com.fadi.imhere.dtos;
import lombok.*;
import java.util.Date;
import java.util.UUID;


@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class PostDto {


    private UUID id;
    private String title;
    private String content;
    private int viewCounter;
    private String category;
    private Date creationDate;
    private UserDto user;
    private boolean liked;
    private int repliesCount;
    private boolean checked;
    private boolean validated;
}
