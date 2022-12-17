/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.pedromedeiros2.virtualstore.credencial;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
