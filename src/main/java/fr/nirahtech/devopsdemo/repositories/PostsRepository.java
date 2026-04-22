package fr.nirahtech.devopsdemo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.nirahtech.devopsdemo.domain.Post;

@Repository
public interface PostsRepository extends JpaRepository<Post, Integer> {
    List<Post> findAllByUserId(Integer userId);
}
