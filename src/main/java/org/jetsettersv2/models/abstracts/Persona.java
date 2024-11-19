package org.jetsettersv2.models.abstracts;

import org.jetsettersv2.models.concrete.Direccion;

import java.util.Scanner;
import java.util.UUID;

public abstract class Persona {

    private String idPersona = UUID.randomUUID().toString();
    private String nombre;
    private String apellido;
    private String dni;
    private String pasaporte;
    private String telefono;
    private Direccion direccion;
    private String email;
    private String contrasenia;


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

    public Direccion getDireccion() {
        return direccion;
    }

    public Persona setDireccion(Direccion direccion) {
        this.direccion = direccion;
        return this;
    }

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

    // <<<<<<<TO STRING>>>>>>>

    @Override
    public String toString() {
        return "Persona{" +
                "idPersona='" + idPersona + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", pasaporte='" + pasaporte + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion=" + direccion +
                '}';
    }

    // <<<<<<<REGISTRO>>>>>>>

    public void solicitarEmail() {
        Scanner scanner = new Scanner(System.in);
        String regex = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        boolean emailValido = false;

        while (!emailValido) {
            System.out.print("Ingrese un email válido: ");
            String input = scanner.nextLine();

            if (input.matches(regex)) {
                this.email = input;
                emailValido = true;
                System.out.println("Email registrado correctamente.");
            } else {
                System.out.println("Email inválido. Por favor, intente nuevamente.");
            }
        }

    }


}
