/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.pedromedeiros2.virtualstore.pedido;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


public class PedidoService implements PedidoServiceLocal {

    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public void persist(Pedido pedido) {
        entityManager.persist(pedido);
    }

    @Override
    public List<Pedido> showOrder() {
        Query query = entityManager.createQuery("SELECT p FROM Pedido p");
        return (List<Pedido>) query.getResultList();
    }

    @Override
    public Pedido find(Long id) {
        return entityManager.find(Pedido.class, id);
    }

    @Override
    public void update(Pedido pedido) {
        entityManager.merge(pedido);
    }

    @Override
    public void delete(Long id) {
        Pedido pedido = find(id);
        entityManager.remove(pedido);   
    }
    
}
