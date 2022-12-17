/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package io.github.pedromedeiros2.virtualstore.pedido;

import java.util.List;
import javax.ejb.Local;


/**
 *
 * @author Pedro Medeiros <phsm at aluno.ifnmg.edu.br>
 */
@Local
public interface PedidoServiceLocal {
    
    void persist(Pedido pedido);
    public Pedido find(Long id);
    void update(Pedido pedido);
    void delete(Long id);
    List<Pedido> showOrder();
}
