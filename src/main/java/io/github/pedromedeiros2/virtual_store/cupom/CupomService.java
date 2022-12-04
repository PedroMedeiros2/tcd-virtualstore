/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.pedromedeiros2.virtual_store.cupom;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Daniel Alves<gatosfofos3 at gmail.com>
 */
public class CupomService implements CupomServiceLocal{

    @PersistenceContext
    private EntityManager entityManager;
    
    
    @Override
    public void persist(Cupom cupom) {
        entityManager.persist(cupom);
    }

    @Override
    public List<Cupom> showCategoria() {
        Query query = entityManager.createQuery("SELECT c FROM Cupom c");
        return (List<Cupom>) query.getResultList();
    }
    
}
