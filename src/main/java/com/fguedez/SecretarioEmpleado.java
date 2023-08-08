package com.fguedez;

public class SecretarioEmpleado implements IEmpleados {
    public String getTareas(){
        return "Gestionar la agenda de los jefes";
    }

    @Override
    public String getInforme() {
        return null;
    }
}
