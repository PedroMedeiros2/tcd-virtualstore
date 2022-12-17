/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package io.github.pedromedeiros2.virtualstore.item;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Pedro Medeiros <phsm at aluno.ifnmg.edu.br>
 */
@Local
public interface ItemServiceLocal {
    
    void persist(Item item);
    public Item find(Long id);
    void update(Item item);
    void delete(Long id);
    List<Item> showItem();
}
