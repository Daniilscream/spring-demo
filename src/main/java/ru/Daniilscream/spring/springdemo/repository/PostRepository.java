package ru.Daniilscream.spring.springdemo.repository;

import org.springframework.data.repository.CrudRepository;
import ru.Daniilscream.spring.springdemo.models.Post;

public interface PostRepository extends CrudRepository<Post,Long> {

}
