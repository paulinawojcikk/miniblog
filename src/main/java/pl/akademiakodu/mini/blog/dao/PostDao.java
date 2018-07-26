package pl.akademiakodu.mini.blog.dao;

import org.springframework.data.repository.CrudRepository;
import pl.akademiakodu.mini.blog.model.Post;

public interface PostDao extends CrudRepository<Post, Long> {


}
