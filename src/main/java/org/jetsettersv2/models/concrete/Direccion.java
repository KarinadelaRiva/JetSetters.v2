package org.jetsettersv2.models.concrete;

public class Direccion {
    //Atributos
    private String calle;
    private int numero;
    private String Ciudad;
    private String codigoPostal;
    private String pais;

    //Constructor
    public Direccion() {

    }

    //Getters and Setters
    public String getCalle() {
        return calle;
    }

    public Direccion calle(String calle) {
        this.calle = calle;
        return this;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    //-------------------------------------------------------------
    public int getNumero() {
        return numero;
    }

    public Direccion numero(int numero) {
        this.numero = numero;
        return this;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //-------------------------------------------------------------
    public String getCiudad() {
        return Ciudad;
    }

    public Direccion ciudad(String ciudad) {
        Ciudad = ciudad;
        return this;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    //-------------------------------------------------------------
    public String getCodigoPostal() {
        return codigoPostal;
    }

    public Direccion codigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
        return this;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    //-------------------------------------------------------------
    public String getPais() {
        return pais;
    }

    public Direccion pais(String pais) {
        this.pais = pais;
        return this;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    //toString
    @Override
    public String toString() {
        return "Direccion: " + '\n' +
                "Calle: " + calle + '\n' +
                "Numero: " + numero + '\n' +
                "Ciudad: " + Ciudad + '\n' +
                "CodigoPostal: " + codigoPostal + '\n' +
                "Pais: " + pais + '\n';
    }

    //Metodos propios
    //Mostrar direccion:
    public void mostrar(){
        System.out.println("<<< Direccion >>>");
        System.out.println("Calle........................: " + this.calle);
        System.out.println("Numero.......................: " + this.numero);
        System.out.println("Ciudad.......................: " + this.Ciudad);
        System.out.println("Codigo postal................: " + this.codigoPostal);
        System.out.println("Pais.........................: " + this.pais);
    }
}
