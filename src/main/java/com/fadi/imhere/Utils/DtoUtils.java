
package com.fadi.imhere.Utils;

import com.fadi.imhere.dtos.PostDto;
import com.fadi.imhere.dtos.UserDto;
import com.fadi.imhere.model.Post;
import com.fadi.imhere.model.User;
import org.modelmapper.ModelMapper;

import java.security.InvalidParameterException;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class DtoUtils {

    private static ModelMapper getModelMapperInstance() {
        return new ModelMapper();
    }

    private DtoUtils() {
        throw new IllegalStateException("Utils class");
    }

    public static <T> List<T> makeList(Iterable<T> iterable) {
        return StreamSupport
                .stream(iterable.spliterator(), false)
                .collect(Collectors.toList());
    }

    public static UserDto convertUserToDto(User user) {
        UserDto userDto = null;
        if(user != null) {
            userDto = getModelMapperInstance().map(user, UserDto.class);
        }
        return userDto;
    }

    public static User convertUserToEntity(UserDto userDto){
        User user = null;
        if(userDto != null){
            user = getModelMapperInstance().map(userDto, User.class);
        }
        return user;
    }

    public static PostDto convertPostToDto(Post post) {
        PostDto postDto = null;
        if(post != null) {
            postDto = getModelMapperInstance().map(post, PostDto.class);
            if(post.getUser() != null) {
                postDto.setUsername(post.getUser().getUsername());
            }
        }
        return postDto;
    }

    public static Post convertPostToEntity(PostDto postDto) {
        return getModelMapperInstance().map(postDto, Post.class);
    }

    public static UUID stringToUUID(String string) {
        UUID uuid;
        try {
            uuid = UUID.fromString(string);
        } catch (IllegalArgumentException e) {
            throw new InvalidParameterException(e.getMessage());
        }
        return uuid;
    }
}

