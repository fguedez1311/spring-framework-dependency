package com.fguedez;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSimgletonPrototype {
    public static void main(String[] args) {
        // Carga de XML de configuración
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
        // Petición de beans al contenedor
        SecretarioEmpleado Maria= context.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
        SecretarioEmpleado Pablo= context.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
        System.out.println(Maria);
        System.out.println(Pablo);

    }
}
