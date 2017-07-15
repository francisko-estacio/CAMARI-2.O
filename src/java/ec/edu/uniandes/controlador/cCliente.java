
package ec.edu.uniandes.controlador;

import ec.edu.uniandes.entidades.clsCliente;
import ec.edu.uniandes.funciones.CrudCliente;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class cCliente {
    private List<clsCliente> lista;
    private clsCliente newCliente;//ingrese un priente nuevo
    private clsCliente selectedCliente;//cuando seleccione un cliente para borrar o actualizar
    

    private void cargarDatos(){
        lista=CrudCliente.findbyAll();
    }
    
    public cCliente() {
        newCliente = new clsCliente();
        cargarDatos();    
    }
    
    public void insertar(){
        if (CrudCliente.save(newCliente)) {//guarda el cliente
            newCliente = new clsCliente();//prepara el contructor de un posible nuevo cliente
            cargarDatos();//refresca el datagrid con los cambios (aparrece el nuevo cliente)
            //mostrar un mensaje
        }
        else{
            //mostrar un mensaje de no guardado
        }
    }
    
    public void eliminar(){
        if (CrudCliente.delete(selectedCliente)) {
            //prepara el contructor de un posible nuevo cliente
            cargarDatos();//refresca el data grid
            //mostrar un mensaje
        }
        else{
            //mostrar un mensaje de no guardado
        }
    }
    
    public void modificar(){
        if (CrudCliente.update(selectedCliente)) {
            newCliente = new clsCliente();//prepara el contructor de un posible nuevo cliente
            cargarDatos();//refresca el data grid
            //mostrar un mensaje
        }
        else{
            //mostrar un mensaje de no guardado
        }
    }

    public List<clsCliente> getLista() {
        return lista;
    }

    public void setLista(List<clsCliente> lista) {
        this.lista = lista;
    }

    public clsCliente getNewCliente() {
        return newCliente;
    }

    public void setNewCliente(clsCliente newCliente) {
        this.newCliente = newCliente;
    }

    public clsCliente getSelectedCliente() {
        return selectedCliente;
    }

    public void setSelectedCliente(clsCliente selectedCliente) {
        this.selectedCliente = selectedCliente;
    }
    
}
