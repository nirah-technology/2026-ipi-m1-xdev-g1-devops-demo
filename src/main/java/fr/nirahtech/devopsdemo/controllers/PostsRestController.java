package fr.nirahtech.devopsdemo.controllers;

import java.util.Objects;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.nirahtech.devopsdemo.domain.Post;
import fr.nirahtech.devopsdemo.repositories.PostsRepository;

@RestController
@RequestMapping("/posts")
public class PostsRestController {

    private final PostsRepository postsRepository;

    public PostsRestController(PostsRepository postsRepository) {
        this.postsRepository = postsRepository;
    }

    @GetMapping("")
    public Page<Post> findAllPosts(Pageable pageable, @RequestParam(name="user_id", required = false) Integer userId) {
        final Page<Post> posts;
        if (Objects.isNull(userId)) {
            posts = this.postsRepository.findAll(pageable);
        } else {
            posts = this.postsRepository.findAllByUserId(userId, pageable);
        }
        return posts;
    }

    @PostMapping("")
    public Post createPost(@RequestBody Post post) {
        return this.postsRepository.save(post);
    }
}
