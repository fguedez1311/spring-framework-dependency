package com.fguedez;

public class JefeEmpleado implements IEmpleados {
  public String getTareas(){
      return "Getiono las cuestiones relativas a mis empleados de sección";
    }

    @Override
    public String getInforme() {
        return null;
    }
}
