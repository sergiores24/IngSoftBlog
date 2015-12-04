/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.utb.softeng.blog.ServiceImpl;
import co.utb.softeng.blog.Service.PostBlogService;
import co.utb.softeng.blog.DAO.PostBlogDAO;
import co.utb.softeng.blog.Entidades.Post;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author Tetrimino
 */
@Service
@Transactional
public class PostBlogServiceImpl implements PostBlogService{
    @Autowired
    PostBlogDAO postDAO;
    
    @Override
    public List<Post> getallPosts() {
        return postDAO.getallPost();
    }
    
    @Override
    public Post getPostbyId(Long Id) {
        return postDAO.getbyId(Id);
    }

    @Override
    public Post getPostbytitulo(String titulo) {
        return postDAO.getbytitulo(titulo);
    }

    @Override
    public Post getPostbykeywords(String keywords) {
        return postDAO.getbykeywords(keywords);
    }

    @Override
    public void publicarOeditarpost(Post post) {
        postDAO.publicarOeditarpost(post);
    }

    @Override
    public void eliminarpost(Long Id) {
        postDAO.eliminarpost(Id);
    }
    
}
