/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.uniandes.prueba;

import ec.edu.uniandes.entidades.clsDfproducto;
import ec.edu.uniandes.entidades.clsProducto;
import ec.edu.uniandes.funciones.CrudDfproducto;

/**
 *
 * @author Usuario
 */
public class tesdfpro {
  
 public static void main(String[] args) {
          
       //clsfactura fac = new clsfactura (01,null,0,0,0,cli);
        clsProducto pro = new clsProducto(02, "libro", 20, 30.0);
        clsDfproducto dell = new    clsDfproducto (01,pro,null, 20, 21);
       
   
        CrudDfproducto res= new CrudDfproducto();
        System.out.println("Prueba de clases");
        System.out.println("=============================================");
        System.out.println("contenido de la clase c");
        System.out.println(dell.toString());
        System.out.println("=============================================");
        System.out.println("=============================================");
        System.out.println("INSERTANDO");
        if (res.save(dell)) {
            System.out.println("Guardado");
        } else {
            System.out.println("error!!!!");
        }
    }
}

  

