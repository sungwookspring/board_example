package com.board.choisunguk.Service;

import com.board.choisunguk.Controller.Dto.PostsSaveRequestDto;
import com.board.choisunguk.Domain.posts.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    @Transactional
    public long save(PostsSaveRequestDto requestDto){
        return postRepository.save(requestDto.toEntity()).getId();
    }
}
