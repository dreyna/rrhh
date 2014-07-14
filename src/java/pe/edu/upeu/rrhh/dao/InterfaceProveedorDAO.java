/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.rrhh.dao;

import java.util.List;
import pe.edu.upeu.rrhh.modelo.Proveedor;

/**
 *
 * @author Docente
 */
public interface InterfaceProveedorDAO {
    public List<Proveedor> list();
    public List<Proveedor> list2();
    public Proveedor edit(int id);
    public boolean edit(Proveedor proveedor);
    public boolean save(Proveedor proveedor);
    public boolean delete(int id);
   
}
