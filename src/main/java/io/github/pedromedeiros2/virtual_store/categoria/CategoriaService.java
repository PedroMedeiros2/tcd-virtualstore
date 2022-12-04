/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.pedromedeiros2.virtual_store.categoria;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Daniel Alves<gatosfofos3 at gmail.com>
 */
public class CategoriaService implements CategoriaServiceLocal{

    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public void persist(Categoria categoria) {
        entityManager.persist(categoria);
    }

    @Override
    public List<Categoria> showCategoria() {
        Query query = entityManager.createQuery("SELECT c FROM Categoria c");
        return (List<Categoria>) query.getResultList();
    }
    
}
