package com.fguedez;

public class SecretarioEmpleado implements IEmpleados {
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    private String nombreEmpresa;
    public void setInformeNuevo(CreacionInformes informeNuevo) {
        this.informeNuevo = informeNuevo;
    }

    private CreacionInformes informeNuevo;
    public String getTareas(){
        return "Gestionar la agenda de los jefes";
    }

    @Override
    public String getInforme() {
        return "Informe generado por el secretario "+informeNuevo.getInforme();
    }
}
