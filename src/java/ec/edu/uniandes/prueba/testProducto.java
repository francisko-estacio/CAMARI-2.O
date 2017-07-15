/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.uniandes.prueba;

import ec.edu.uniandes.entidades.clsProducto;
import ec.edu.uniandes.funciones.CrudProducto;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class testProducto {
      public static void main(String[] args) {
         
//        
//        clsProducto p = new clsProducto(01, "libro", 2, 300);
// 
//          CrudProducto pro = new CrudProducto();
//        
//        System.out.println("Prueba de clases");
//        System.out.println("=============================================");
//        
//        System.out.println(p.toString());
//        System.out.println("=============================================");
//        System.out.println("=============================================");
//        System.out.println("INSERTANDO");
//        if (pro.save(p)) {
//            System.out.println("Guardado");
//        }else{
//            System.out.println("error!!!!");
//        }
//        System.out.println("Comprobando si hay datos");
//        System.out.println(cc.findbyId(po).toString());
//        System.out.println("=============================================");
//        System.out.println("=============================================");
//        System.out.println("Eliminando");    
//        if (cc.delete(po)) {
//            System.out.println("eliminado");
//        }else{
//            System.out.println("no se ha podido eliminar");
//        }
        
          ArrayList<clsProducto> pro= new ArrayList<>();
          pro = CrudProducto.findbyAll();
          System.out.println(pro.toString());
     }
    

}
