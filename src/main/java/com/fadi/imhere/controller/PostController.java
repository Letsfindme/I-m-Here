package com.fadi.imhere.controller;

import com.fadi.imhere.dtos.PostDto;
import com.fadi.imhere.service.PostServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.security.InvalidParameterException;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostServiceImp postService;

    /**
     * Get all posts by user
     * @param userId
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public List<PostDto> findAll(@RequestParam("user-id") UUID userId) {
        return postService.findAll(userId);
    }

    @RequestMapping(value = "/{id-post}", method = RequestMethod.GET)
    @ResponseBody
    public PostDto getPostById(@PathVariable("id-post") UUID postId, @RequestParam("user-id") UUID userId) {
        return postService.getPostById(postId, userId);
    }

    /**
     * Create a post
     * @param postDto
     * @return
     */
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public PostDto createPost(@RequestBody PostDto postDto) {
        if(postDto.getUser() == null) {
            throw new InvalidParameterException("No author");
        }
        return postService.createPost(postDto);
    }

}
