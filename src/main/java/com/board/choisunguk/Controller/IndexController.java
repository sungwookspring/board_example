package com.board.choisunguk.Controller;

import com.board.choisunguk.Controller.Dto.PostListResponseDto;
import com.board.choisunguk.Service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class IndexController {
    private final PostService postService;

    @GetMapping("/")
    public String index(Model model){
        List<PostListResponseDto> allPosts = postService.findAllDesc();
        model.addAttribute("posts", allPosts);
        return "index";
    }

    @GetMapping("/posts/save")
    public String postsSave(){
        return "posts-save";
    }
}
