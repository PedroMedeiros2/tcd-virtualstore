/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.pedromedeiros2.virtual_store.item;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


public class ItemService implements ItemServiceLocal {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public void persist(Item item) {
        entityManager.persist(item);
    }

    @Override
    public List<Item> showItem() {
        Query query = entityManager.createQuery("SELECT i FROM Item i");
        return (List<Item>) query.getResultList();
    }

    @Override
    public Item find(Long id) {
        return entityManager.find(Item.class, id);
    }

    @Override
    public void update(Item item) {
        entityManager.merge(item);
    }

    @Override
    public void delete(Long id) {
        Item item = find(id);
        entityManager.remove(item);   
    }
    
}
