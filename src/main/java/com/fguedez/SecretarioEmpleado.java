package com.fguedez;

public class SecretarioEmpleado implements IEmpleados {
    public void setInformeNuevo(CreacionInformes informeNuevo) {
        this.informeNuevo = informeNuevo;
    }

    private CreacionInformes informeNuevo;
    public String getTareas(){
        return "Gestionar la agenda de los jefes";
    }

    @Override
    public String getInforme() {
        return "Informe generado por el secretario"+informeNuevo.getInforme();
    }
}
