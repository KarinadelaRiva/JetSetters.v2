package org.jetsettersv2.models.concrete;

import java.time.LocalDate;

public class Vuelo {
    private String nroVuelo;
    private Avion avion;
    private Ruta ruta;
    private LocalDate fechaSalida;
    private LocalDate horaSalida;
    private RegistroDeVuelo registroDeVuelo;

    // <<<<<<<METODOS IMPRESION>>>>>>>

    public void imprimir(){
        System.out.println("Número de vuelo......................: " + this.nroVuelo);
        System.out.println("Avión................................: " + this.avion.getModelo());
        System.out.println("Ruta.................................: ");
        this.ruta.imprimir();
        System.out.println("Fecha de salida......................: " + this.fechaSalida);
        System.out.println("Hora de salida.......................: " + this.horaSalida);
    }

    // <<<<<<<CONSTRUCTORS>>>>>>>

    public Vuelo() {
    }

    // <<<<<<<GETTERS>>>>>>>

    public String getNroVuelo() {
        return nroVuelo;
    }

    public Avion getAvion() {
        return avion;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public LocalDate getHoraSalida() {
        return horaSalida;
    }

    public RegistroDeVuelo getRegistroDeVuelo() {
        return registroDeVuelo;
    }

    // <<<<<<<SETTERS>>>>>>>

    public void setNroVuelo(String nroVuelo) {
        this.nroVuelo = nroVuelo;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setHoraSalida(LocalDate horaSalida) {
        this.horaSalida = horaSalida;
    }

    public void setRegistroDeVuelo(RegistroDeVuelo registroDeVuelo) {
        this.registroDeVuelo = registroDeVuelo;
    }

    // <<<<<<<BUILDERS>>>>>>>

    public Vuelo nroVuelo(String nroVuelo) {
        this.nroVuelo = nroVuelo;
        return this;
    }

    public Vuelo avion(Avion avion) {
        this.avion = avion;
        return this;
    }

    public Vuelo ruta(Ruta ruta) {
        this.ruta = ruta;
        return this;
    }

    public Vuelo fechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
        return this;
    }

    public Vuelo horaSalida(LocalDate horaSalida) {
        this.horaSalida = horaSalida;
        return this;
    }

    public Vuelo registroDeVuelo(RegistroDeVuelo registroDeVuelo) {
        this.registroDeVuelo = registroDeVuelo;
        return this;
    }

    // <<<<<<<TO STRING>>>>>>>

    @Override
    public String toString() {
        return "Vuelo{" +
                "nroVuelo='" + nroVuelo + '\'' +
                ", avion=" + avion +
                ", ruta=" + ruta +
                ", fechaSalida=" + fechaSalida +
                ", horaSalida=" + horaSalida +
                ", registroDeVuelo=" + registroDeVuelo +
                '}';
    }

    // <<<<<<<EQUALS>>>>>>>

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vuelo)) return false;

        Vuelo vuelo = (Vuelo) o;

        if (!nroVuelo.equals(vuelo.nroVuelo)) return false;
        if (!avion.equals(vuelo.avion)) return false;
        if (!ruta.equals(vuelo.ruta)) return false;
        if (!fechaSalida.equals(vuelo.fechaSalida)) return false;
        if (!horaSalida.equals(vuelo.horaSalida)) return false;
        return registroDeVuelo.equals(vuelo.registroDeVuelo);
    }


    // <<<<<<<HASHCODE>>>>>>>

    @Override
    public int hashCode() {
        int result = nroVuelo.hashCode();
        result = 31 * result + avion.hashCode();
        result = 31 * result + ruta.hashCode();
        result = 31 * result + fechaSalida.hashCode();
        result = 31 * result + horaSalida.hashCode();
        result = 31 * result + registroDeVuelo.hashCode();
        return result;
    }
}
