package com.fguedez;

import org.springframework.context.ApplicationContext;
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
        IEmpleados empl1= context.getBean("miEmpleado",IEmpleados.class);
        System.out.println(empl1.getTareas());
        System.out.println(empl1.getInforme());
        context.close();

    }
}
