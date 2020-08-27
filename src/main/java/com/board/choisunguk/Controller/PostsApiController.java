package com.board.choisunguk.Controller;

import com.board.choisunguk.Controller.Dto.PostsSaveRequestDto;
import com.board.choisunguk.Service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PostsApiController {
    private final PostService postService;

    @PostMapping("/api/v1/posts")
    public long save(@RequestBody PostsSaveRequestDto requestDto){
        return postService.save(requestDto);
    }
}
