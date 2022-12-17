/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package io.github.pedromedeiros2.virtualstore.produto;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Pedro Medeiros <phsm at aluno.ifnmg.edu.br>
 */

@Local
public interface ProdutoServiceLocal {
    
    void persist(Produto produto);
    public Produto find(Long id);
    void update(Produto produto);
    void delete(Long id); 
    List<Produto> showProduct();
}
