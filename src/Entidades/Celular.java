package Entidades;

import java.util.UUID;

public class Celular extends EquipoInformatico{
    private String sistemaOperativo;
    private String almacenamiento;
    private int cantidadCamaras;

    public Celular() {
    }

    public Celular(String sistemaOperativo, String almacenamiento, int cantidadCamaras, UUID codigo, String marca, String modelo, double precio) {
        super(codigo, marca, modelo, precio);
        this.sistemaOperativo = sistemaOperativo;
        this.almacenamiento = almacenamiento;
        this.cantidadCamaras = cantidadCamaras;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getCantidadCamaras() {
        return cantidadCamaras;
    }

    public void setCantidadCamaras(int cantidadCamaras) {
        this.cantidadCamaras = cantidadCamaras;
    }
    
    
}
