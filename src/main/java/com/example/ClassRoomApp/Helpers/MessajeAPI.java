package com.example.ClassRoomApp.Helpers;

public enum MessajeAPI {
    ERROR_PROFESSOR_NO_ENCONTRADO("El docente que buscas, no está en la base de datos"),
    ERROR_ESTUDIANTE_NO_ENCONTRADO("El estudiante que buscas, no está en la base de datos")
    ;

    private String mensaje;

    MessajeAPI(String mensaje) {
        this.mensaje =  mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
