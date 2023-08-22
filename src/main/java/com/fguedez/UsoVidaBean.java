package com.fguedez;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoVidaBean {
    public static void main(String[] args) {
        //Cargar el xml de configuración
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");
        //Obtención del bean 
        IEmpleados juan= context.getBean("miEmpleado", IEmpleados.class);
        System.out.println(juan.getInforme());
        context.close();
    }
}
