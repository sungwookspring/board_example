package com.board.choisunguk.Controller.Dto;

import com.board.choisunguk.Domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsResponseDto {
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity) {
        title = entity.getTitle();
        content = entity.getContent();
        author = entity.getAuthor();
    }
}
