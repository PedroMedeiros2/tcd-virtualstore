/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package io.github.pedromedeiros2.virtual_store.pedido;

import java.util.List;
import javax.ejb.Local;


/**
 *
 * @author Pedro Medeiros <phsm at aluno.ifnmg.edu.br>
 */
@Local
public interface PedidoServiceLocal {
    
    void persist(Pedido pedido);
    List<Pedido> showOrder();
}
