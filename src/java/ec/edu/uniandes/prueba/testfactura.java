/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.uniandes.prueba;

import ec.edu.uniandes.entidades.clsCliente;
import ec.edu.uniandes.entidades.clsFactura;
import ec.edu.uniandes.funciones.CrudFactura;

/**
 *
 * @author Usuario
 */
public class testfactura {
     public static void main(String[] args) {
          
//       
        clsCliente cli = new clsCliente(02, "1600089954", "ismael", "recreo");
//       
       clsFactura factura = new clsFactura(01,cli,null,20,12,100);
        CrudFactura res= new CrudFactura();
//        System.out.println("Prueba de clases");
//        System.out.println("=============================================");
//        System.out.println("contenido de la clase c");
//        System.out.println(factura.toString());
//        System.out.println("=============================================");
//        System.out.println("=============================================");
//        System.out.println("INSERTANDO");
//        if (res.save(factura)) {
//            System.out.println("Guardado");
//        } else {
//            System.out.println("error!!!!");
//        }
//    
//    
//        System.out.println("Comprobando si hay datos");
//        //System.out.println(res.findbyId(factura).toString());
//        System.out.println("=============================================");
//        System.out.println("=============================================");
//        System.out.println("Eliminando");
//        if (res.delete(factura)) {
//            System.out.println("eliminado");
//        } else {
//            System.out.println("no se ha podido eliminar");
//        }

//
        System.out.println("Comprobando si hay datos");
        //System.out.println(res.findbyId(fac).toString());
        System.out.println("=============================================");
        System.out.println("=============================================");
        System.out.println("Actualizando");
        if (res.update(factura)) {
            System.out.println("Actualizado");
        } else {
            System.out.println("no se ha podido actualizar");
        }


//        System.out.println("Comprobando si hay datos");
//        System.out.println(pp.findbyId(p).toString());
//        System.out.println("=============================================");
//        System.out.println("=============================================");
//        System.out.println("Listando");
//        if (pp.findbyAll(p)) {
//            System.out.println("Listado");
//        } else {
//            System.out.println("no se ha podido listar");
//        }





   } 
    

}
