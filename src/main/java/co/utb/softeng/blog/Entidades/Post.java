/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.utb.softeng.blog.Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author JAIRO
 */

@Entity
@Table (name = "POST")
public class Post implements Serializable {
    
    @Id
    @GeneratedValue
    private Long id;
    private String titulo;
    private String keywords;
    @Lob
    private String cuerpo;
    @Temporal(value=TemporalType.DATE)
    private Date fechacreacion;

    public Long getid() {
        return id;
    }

    public void setid(Long id) {
        this.id = id;
    }

    public String gettitulo() {
        return titulo;
    }

    public void settitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getcuerpo()
    {
        return cuerpo;
    }
    
    public void setcuerpo(String cuerpo)
    {
        this.cuerpo = cuerpo; 
    }

    public Date getfechacreacion() {
        return fechacreacion;
    }

    public void setfechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }
    
    public String getkeywords() {
        return keywords;
    }

    public void setkeywords(String keywords) {
        this.keywords = keywords;
    }
}
