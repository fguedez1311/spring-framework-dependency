package com.fguedez;

public class DirectorEmpleado implements IEmpleados {
    //Creación de campo tipo creacionInforme (interfaz)
    private CreacionInformes informeNuevo;
    //Creación del constructor que inyecta la dependencia
    public DirectorEmpleado(CreacionInformes informeNuevo ){
        this.informeNuevo=informeNuevo;
    }
    public String getTareas(){
        return "Getionar la plantilla de la empresa ";
    }

    @Override
    public String getInforme() {
        return "Informe creado por el Director: "+informeNuevo.getInforme();
    }
}
