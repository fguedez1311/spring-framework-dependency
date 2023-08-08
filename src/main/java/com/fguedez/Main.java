package com.fguedez;


import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        IEmpleados empl2= context.getBean("miSecretarioEmpleado",IEmpleados.class);
        System.out.println(empl2.getTareas());
        System.out.println(empl2.getInforme());
        context.close();

    }
}
