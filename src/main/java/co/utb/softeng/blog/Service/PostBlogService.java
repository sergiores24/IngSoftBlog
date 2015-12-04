/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.utb.softeng.blog.Service;
import co.utb.softeng.blog.Entidades.Post;
import java.util.List;
/**
 *
 * @author Tetrimino
 */
public interface PostBlogService {
    public List<Post> getallPosts();
    public Post getPostbyId(Long Id);
    public Post getPostbytitulo(String titulo);
    public Post getPostbykeywords(String keywords);
    //public Post getPostbycuerpo(String cuerpo);
    public void publicarpost(Post post);
    public void editarpost(Post post);
    public void eliminarpost(Long Id);
    
}
