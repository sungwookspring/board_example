package com.board.choisunguk.Service;

import com.board.choisunguk.Controller.Dto.PostsSaveRequestDto;
import com.board.choisunguk.Controller.Dto.PostsUpdateRequestDto;
import com.board.choisunguk.Domain.posts.PostRepository;
import com.board.choisunguk.Domain.posts.Posts;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto){
        return postRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, PostsUpdateRequestDto requestDto) {
        Posts posts = postRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id" + id));

        posts.update(requestDto.getTitle(), requestDto.getContent());

        return id;
    }
}
