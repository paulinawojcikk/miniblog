package pl.akademiakodu.mini.blog.controller;

import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.akademiakodu.mini.blog.dao.PostDao;
import pl.akademiakodu.mini.blog.model.Post;

@Controller
public class PostController {

    @Autowired
    private PostDao postDao;



    @GetMapping("/posts/add")
    public String addPost(){
        return "posts/add";
    }

    @PostMapping("/posts/add")
    public String createPost(@ModelAttribute
                                     Post post, ModelMap modelMap){
        postDao.save(post);
        return "redirect:/posts/all";
    }

    @GetMapping("/posts/all")
    public String all(ModelMap modelMap){
        modelMap.put("posts",postDao.findAll());
        return "posts/all";
    }




}
