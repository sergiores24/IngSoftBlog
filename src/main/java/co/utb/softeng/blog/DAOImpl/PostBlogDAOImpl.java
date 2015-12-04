/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.utb.softeng.blog.DAOImpl;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Subqueries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import co.utb.softeng.blog.DAO.PostBlogDAO;
import co.utb.softeng.blog.Entidades.Post;
import java.util.Date;
import java.util.List;

/**
 *
 * @author JAIRO
 */
@Repository
public class PostBlogDAOImpl implements PostBlogDAO {
    
    @Autowired
    SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }
    
    @Override
    public List<Post> getallPost() {
        Criteria crit = getSession().createCriteria(Post.class);
        return crit.list();
    }
    
    @Override
    public Post getbyId(Long Id) {
        return (Post) getSession()
                .createCriteria(Post.class)
                .add(Restrictions.idEq(Id))
                .uniqueResult();
    }

    @Override
    public Post getbytitulo(String titulo) {
        return  (Post) getSession()
                .createCriteria(Post.class)
                .add(Restrictions.ilike("titulo", titulo))
                .uniqueResult();
    }

    @Override
    public Post getbykeywords(String keywords) {
        return  (Post) getSession()
                .createCriteria(Post.class)
                .add(Restrictions.ilike("keywords", keywords))
                .uniqueResult();
    }

/*    @Override
    public Post getbycuerpo(String cuerpo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    @Override
    public void publicarOeditarpost(Post post) {
        if(post.geteditado()==0){
            post.setfechacreacion(new Date());
        }
        getSession().saveOrUpdate(post);
    }

    @Override
    public void eliminarpost(Long Id) {
        Post post = new Post();
        post.setid(Id);
        getSession().delete(post);
    }
    
}
