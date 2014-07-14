/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.rrhh.test;

import java.util.List;
import pe.edu.upeu.rrhh.dao.ProveedorDAO;
import pe.edu.upeu.rrhh.dao.InterfaceProveedorDAO;
import pe.edu.upeu.rrhh.modelo.Proveedor;

public class Test {
    public static void main(String[] args){
        Test test = new Test();
        //test.listMYSQL();
        //test.editarmysql();
       test.deleteMYSQl();
        test.listMYSQL();
 }
    public void listMYSQL(){
        InterfaceProveedorDAO aO = new ProveedorDAO();
        List<Proveedor> list = aO.list();
        if(list!=null){
        System.out.println("Listado de Proveedor");
            for(int i=0;i<list.size();i++){    
            System.out.println("id :"+list.get(i).getId()+"proveedor:"+list.get(i).getProv());        
            }
        }else{
            System.out.println("falla"); 
        }
   }
    public void editarmysql(){
        InterfaceProveedorDAO aO = new ProveedorDAO();
        Proveedor proveedor = aO.edit(5);
        System.out.println("id :"+proveedor.getProv()); 
    
    }
    public void saveMYSQl(){
        InterfaceProveedorDAO aO = new ProveedorDAO();
        Proveedor proveedor = new Proveedor();
        proveedor.setId(11);
        proveedor.setProv("camilo");
        proveedor.setRuc("1111");
        proveedor.setDir("alameda");
        proveedor.setTel("98980000");
        proveedor.setEst("1");
        aO.save(proveedor);
    }
     public void deleteMYSQl(){
         InterfaceProveedorDAO aO = new ProveedorDAO();
        Proveedor proveedor = new Proveedor();
        aO.delete(4);
     }
}