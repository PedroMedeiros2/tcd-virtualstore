/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.pedromedeiros2.virtual_store.usuario;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class UsuarioService implements UsuarioServiceLocal {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public void persist(Usuario usuario) {
        entityManager.persist(usuario);
    }

    @Override
    public List<Usuario> showUser() {
        Query query = entityManager.createQuery("SELECT u FROM Usuario u");
        return (List<Usuario>) query.getResultList();
    }
      
}
