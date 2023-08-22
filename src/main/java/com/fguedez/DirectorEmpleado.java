package com.fguedez;

public class DirectorEmpleado implements IEmpleados {
    private String email;

    private String nombreEmpresa;
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
    //Creación de campo tipo creacionInforme (interfaz)
    private CreacionInformes informeNuevo;
    //Creación del constructor que inyecta la dependencia
    public DirectorEmpleado(CreacionInformes informeNuevo ){
        this.informeNuevo=informeNuevo;
    }
    // Método init. Ejecutar tareas antes de que bean esté disponible
    public void metodoInicial(){
        System.out.println("Dentro del método init. Aqui irian las tareas ejecuta antes de que el bean esté listo");
    }
     public void metodoFinal(){
        System.out.println("Dentro del método destroy. Aqui irian las tareas ejecuta despues de utilizar el bean");
    }


    //método destroy.Ejecutar tarea desques de que el bean haya sid ejecutado
    public String getTareas(){
        return "Getionar la plantilla de la empresa ";
    }

    @Override
    public String getInforme() {
        return "Informe creado por el Director: "+informeNuevo.getInforme();
    }
}
