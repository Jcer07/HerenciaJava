package Colecciones;

import Entidades.Celular;
import Entidades.EquipoInformatico;
import Entidades.Notebook;
import java.util.ArrayList;
import java.util.UUID;

public class ListadoEquipos {
    private static ArrayList<EquipoInformatico> listado = new ArrayList<>();
    
    public static void Agregar(EquipoInformatico equipo){
        listado.add(equipo);
    }
    
    public static ArrayList<EquipoInformatico> getList(){
        return listado;
    }
    
    public static EquipoInformatico buscarEquipoInformatico(UUID codigo){
        return listado.stream()
                .filter(obj -> obj.getCodigo().equals(codigo))
                .findFirst()
                .orElse(null);
    }
    
    public static void eliminarEquipoInformatico(UUID codigo){
        listado.removeIf(equipo -> equipo.getCodigo().equals(codigo));
    }
    
    public static boolean editarEquipo(EquipoInformatico equipo){
        boolean resultado = false;
        for (EquipoInformatico obj : listado) {
            if(obj.getCodigo().equals(equipo.getCodigo())){
                if(obj instanceof Notebook){
                    Notebook notebook = (Notebook) obj;
                    Notebook objNotebook = (Notebook) equipo;
                    
                    notebook.setMarca(objNotebook.getMarca());
                    notebook.setModelo(objNotebook.getModelo());
                    notebook.setPrecio(objNotebook.getPrecio());
                    notebook.setSistemaOperativo(objNotebook.getSistemaOperativo());
                    notebook.setCantidadRam(objNotebook.getCantidadRam());
                    notebook.setCantidadAlmacenamiento(objNotebook.getCantidadAlmacenamiento());
                    notebook.setTamanioPantalla(objNotebook.getTamanioPantalla());

                    resultado = true;
                    break;
                }
                
                if(obj instanceof Celular){
                    Celular celular = (Celular) obj;
                    Celular objCelular = (Celular) equipo;
                    
                    celular.setMarca(objCelular.getMarca());
                    celular.setModelo(objCelular.getModelo());
                    celular.setPrecio(objCelular.getPrecio());
                    celular.setSistemaOperativo(objCelular.getSistemaOperativo());
                    celular.setAlmacenamiento(objCelular.getAlmacenamiento());
                    celular.setCantidadCamaras(objCelular.getCantidadCamaras());

                    resultado = true;
                    break;
                }
            }
        }
        
        return resultado;
    }
}
