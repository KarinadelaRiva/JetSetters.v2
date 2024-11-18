package org.jetsettersv2.models.abstracts;

import java.util.UUID;

public abstract class Persona {

    private String idPersona = UUID.randomUUID().toString();
    private String nombre;
    private String apellido;
    private String dni;
    private String pasaporte;
    private String telefono;
    //<<NECESITO CLASE DIRECCION
    //private Direccion direccion;


    public Persona() {
    }

    public String getIdPersona() {
        return idPersona;
    }

    public Persona idPersona(String idPersona) {
        this.idPersona = idPersona;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getApellido() {
        return apellido;
    }

    public Persona apellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public String getDni() {
        return dni;
    }

    public Persona dni(String dni) {
        this.dni = dni;
        return this;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public Persona pasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
        return this;
    }

    public String getTelefono() {
        return telefono;
    }

    public Persona telefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

//    public Direccion getDireccion() {
//        return direccion;
//    }
//
//    public Persona setDireccion(Direccion direccion) {
//        this.direccion = direccion;
//        return this;
//    }

    // <<<<<<<METODOS IMPRESION>>>>>>>

    public void imprimir(){
        System.out.println("ID ..................................: " + this.idPersona);
        System.out.println("Nombre...............................: " + this.nombre);
        System.out.println("Apellido.............................: " + this.apellido);
        System.out.println("DNI..................................: " + this.dni);
        System.out.println("Pasaporte............................: " + this.pasaporte);
        System.out.println("Telefono.............................: " + this.telefono);
        System.out.println("<<..........Direccion..............>>: ");
        //direccion.imprimir();
    }

    @Override
    public String toString() {
        return "Persona{" +
                "idPersona='" + idPersona + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", pasaporte='" + pasaporte + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
