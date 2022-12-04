/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package io.github.pedromedeiros2.virtual_store.categoria;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Daniel Alves<gatosfofos3 at gmail.com>
 */
@Local
public interface CategoriaServiceLocal {
    
   
    void persist(Categoria categoria);
    public Categoria find(Long id);
    void update(Categoria categoria);
    void delete(Long id);
    List<Categoria> showCategoria();
    
}
