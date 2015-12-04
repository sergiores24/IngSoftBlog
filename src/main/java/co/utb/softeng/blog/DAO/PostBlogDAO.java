/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.utb.softeng.blog.DAO;

import co.utb.softeng.blog.Entidades.Post;
import java.util.List;

/**
 *
 * @author JAIRO
 */
public interface PostBlogDAO {
    
    public List<Post> getallPost();
    public Post getbyId(Long Id);
    public Post getbytitulo(String titulo);
    public Post getbykeywords(String keywords);
    //public Post getbycuerpo(String cuerpo);
    public void publicarpost(Post post);
    public void editarpost(Post post);
    public void eliminarpost(Long Id);

}
