/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.pedromedeiros2.virtual_store.produto;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


public class ProdutoService implements ProdutoServiceLocal {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public void persist(Produto produto) {
        entityManager.persist(produto);
    }

    @Override
    public List<Produto> showProduct() {
        Query query = entityManager.createQuery("SELECT p FROM Produto p");
        return (List<Produto>) query.getResultList();
    }
    
}
