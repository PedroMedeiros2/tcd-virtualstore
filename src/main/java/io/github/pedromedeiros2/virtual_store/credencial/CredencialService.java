/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.pedromedeiros2.virtual_store.credencial;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Daniel Alves<gatosfofos3 at gmail.com>
 */
public class CredencialService implements CredencialServiceLocal{

    @PersistenceContext
    private EntityManager entityManager;
    
    
    @Override
    public void persist(Credencial credencial) {
        entityManager.persist(credencial);
    }

    @Override
    public List<Credencial> showCategoria() {
        Query query = entityManager.createQuery("SELECT c FROM Credencial c");
        return (List<Credencial>) query.getResultList();
    }

    @Override
    public Credencial find(Long id) {
        return entityManager.find(Credencial.class, id);    
    }

    @Override
    public void update(Credencial credencial) {
        entityManager.merge(credencial);
    }

    @Override
    public void delete(Long id) {
        Credencial credencial = find(id);
        entityManager.remove(credencial);   
    }
    
}
