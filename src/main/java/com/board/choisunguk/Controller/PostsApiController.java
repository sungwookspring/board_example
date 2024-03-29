package com.board.choisunguk.Controller;

import com.board.choisunguk.Controller.Dto.PostsResponseDto;
import com.board.choisunguk.Controller.Dto.PostsSaveRequestDto;
import com.board.choisunguk.Controller.Dto.PostsUpdateRequestDto;
import com.board.choisunguk.Service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
public class PostsApiController {
    private final PostService postService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto){
        log.info("[*] post_save controller called");
        log.info(requestDto.getTitle() + " " + requestDto.getContent() + " " + requestDto.getAuthor());
        return postService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto){
        return postService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id){
        return postService.findById(id);
    }

    @DeleteMapping("/api/v1/posts/{id}")
    public Long delete(@PathVariable Long id){
        postService.delete(id);
        return id;
    }
}
