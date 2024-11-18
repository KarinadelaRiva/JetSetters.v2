package org.jetsettersv2.enums;

public enum EstadoCheck {
    PENDIENTE_DE_APERTURA("Pendiente de apertura."),
    ABIERTO("Abierto."),
    COMPLETADO("Completado."),
    CERRADO("Cerrado."),
    CANCELADO("Cancelado");

    private String descripcion;

    EstadoCheck(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
