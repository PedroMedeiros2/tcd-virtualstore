/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package io.github.pedromedeiros2.virtual_store.cupom;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Daniel Alves<gatosfofos3 at gmail.com>
 */
@Local
public interface CupomServiceLocal {
    void persist(Cupom cupom);
    List<Cupom> showCategoria();
}
