package Entidades;

import java.util.UUID;

public class Notebook extends EquipoInformatico{
    private String sistemaOperativo;
    private String cantidadRam;
    private String cantidadAlmacenamiento;
    private String tamanioPantalla;

    public Notebook() { 
    }

    public Notebook(String sistemaOperativo, String cantidadRam, String cantidadAlmacenamiento, String tamanioPantalla, UUID codigo, String marca, String modelo, double precio) {
        super(codigo, marca, modelo, precio);
        this.sistemaOperativo = sistemaOperativo;
        this.cantidadRam = cantidadRam;
        this.cantidadAlmacenamiento = cantidadAlmacenamiento;
        this.tamanioPantalla = tamanioPantalla;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getCantidadRam() {
        return cantidadRam;
    }

    public void setCantidadRam(String cantidadRam) {
        this.cantidadRam = cantidadRam;
    }

    public String getCantidadAlmacenamiento() {
        return cantidadAlmacenamiento;
    }

    public void setCantidadAlmacenamiento(String cantidadAlmacenamiento) {
        this.cantidadAlmacenamiento = cantidadAlmacenamiento;
    }

    public String getTamanioPantalla() {
        return tamanioPantalla;
    }

    public void setTamanioPantalla(String tamanioPantalla) {
        this.tamanioPantalla = tamanioPantalla;
    }
    
}
