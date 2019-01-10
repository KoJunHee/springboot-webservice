package com.jko.webservice.web;

import com.jko.webservice.domain.posts.PostsRepository;
import com.jko.webservice.domain.posts.PostsSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// @RestController는 @ResponseBody를 모든 메소드에서 적용해줍니다.
// 즉 hello 메소드의 결과는 "HelloWorld" 라는 문자열을 JSON 형태로 반환하게 됩니다.
@RestController
@AllArgsConstructor
public class WebRestController {

    private PostsRepository postsRepository;

//    public WebRestController(PostsRepository postsRepository) {
//        this.postsRepository = postsRepository;
//    }

    @GetMapping("/hello")
    public String hello(){
        return "HelloWorld";
    }

    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDto dto){
        postsRepository.save(dto.toEntity());
    }
}
