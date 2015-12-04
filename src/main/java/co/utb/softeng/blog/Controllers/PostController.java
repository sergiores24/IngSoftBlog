/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.utb.softeng.blog.Controllers;
import co.utb.softeng.blog.Entidades.Post;
import co.utb.softeng.blog.Service.PostBlogService;
import java.util.List;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 *
 * @author Tetrimino
 */
@Controller
@RequestMapping("/post")
public class PostController {
    
    @Autowired
    PostBlogService postService;
    
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.GET)
    public @ResponseBody List<Post> getAllPosts() {
        return postService.getallPosts();
    }
    
    @RequestMapping(value={"/{id}"}, method = RequestMethod.GET)
    public @ResponseBody Post getPostById(@PathVariable Long id) {
        Post a = postService.getPostbyId(id);
        return a;
    }
    
    @Secured("ROLE_EDITOR")
    @RequestMapping(value={"/", ""}, method = RequestMethod.PUT)
    public @ResponseBody Post publicarPost(@RequestBody Post post) {
        postService.publicarOeditarpost(post);
        return post;
    }
    
    @Secured("ROLE_EDITOR")
    @RequestMapping(value={"/", ""}, method = RequestMethod.POST)
    public @ResponseBody Post editarPost(@RequestBody Post post) {
        postService.publicarOeditarpost(post);
        return post;
    }
    
    @Secured("ROLE_EDITOR")
    @RequestMapping(value = "/eliminar/{id}",method = RequestMethod.DELETE) 
    public @ResponseBody void deleteMovie(@PathVariable Long id) {
        postService.eliminarpost(id);
    }
}
