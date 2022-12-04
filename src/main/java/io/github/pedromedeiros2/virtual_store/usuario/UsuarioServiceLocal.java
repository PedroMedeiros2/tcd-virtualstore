/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package io.github.pedromedeiros2.virtual_store.usuario;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Pedro Medeiros <phsm at aluno.ifnmg.edu.br>
 */

@Local
public interface UsuarioServiceLocal {
    
    void persist(Usuario usuario);
    public Usuario find(Long id);
    void update(Usuario usuario);
    void delete(Long id);
    List<Usuario> showUser();
}
