package ec.edu.uniandes.controlador;

import ec.edu.uniandes.entidades.clsProducto;
import ec.edu.uniandes.funciones.CrudProducto;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped


    public class cProducto {

    private List<clsProducto> lista;
    private clsProducto newProducto;
    private clsProducto selectedproducto;

    public cProducto() {
        newProducto = new clsProducto();
        cargarDatos();
    }

    private void cargarDatos() {
        lista = CrudProducto.findbyAll();
    }

    public void insertar() {
        if (CrudProducto.save(newProducto)) {

            newProducto = new clsProducto();
            cargarDatos();

        } else {

        }

    }

    public void eliminar() {
        if (CrudProducto.delete(selectedproducto)) {
            
            newProducto = new clsProducto();
            cargarDatos();

            }else{
            

        }
    }

    public void actualizar() {
        if (CrudProducto.update(selectedproducto)) {
          
                newProducto = new clsProducto();
                cargarDatos();

            } else {

            
        }
    }

    public cProducto(List<clsProducto> lista, clsProducto newProducto, clsProducto selectedproducto) {
        this.lista = lista;
        this.newProducto = newProducto;
        this.selectedproducto = selectedproducto;
    }

    public clsProducto getSelectedproducto() {
        return selectedproducto;
    }

    public void setSelectedproducto(clsProducto selectedproducto) {
        this.selectedproducto = selectedproducto;
    }

    public List<clsProducto> getLista() {
        return lista;
    }

    public void setLista(List<clsProducto> lista) {
        this.lista = lista;
    }

    public clsProducto getNewProducto() {
        return newProducto;
    }

    public void setNewProducto(clsProducto newProducto) {
        this.newProducto = newProducto;
    }

    @Override
    public String toString() {
        return "cProducto{" + "lista=" + lista + ", newProducto=" + newProducto + ", selectedproducto=" + selectedproducto + '}';
    }

}
