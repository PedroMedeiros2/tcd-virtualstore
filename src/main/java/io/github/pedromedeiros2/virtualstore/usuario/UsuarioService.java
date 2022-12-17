/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.pedromedeiros2.virtualstore.usuario;

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

    @Override
    public Usuario find(Long id) {
        return entityManager.find(Usuario.class, id);
    }

    @Override
    public void update(Usuario usuario) {
        entityManager.merge(usuario);
    }

    @Override
    public void delete(Long id) {
        Usuario usuario = find(id);
        entityManager.remove(usuario);
    }
      
}
