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
        DirectorEmpleado Juan= context.getBean("miEmpleado",DirectorEmpleado.class);
        System.out.println(Juan.getTareas());
        System.out.println(Juan.getInforme());
        System.out.println("Email: "+Juan.getEmail());
        System.out.println(Juan.getNombreEmpresa());

       /* SecretarioEmpleado Maria= context.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
        SecretarioEmpleado Pablo= context.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
        System.out.println(Maria.getTareas());
        System.out.println(Maria.getInforme());
        System.out.println("Email: "+Maria.getEmail());
        System.out.println(Maria.getNombreEmpresa());
        System.out.println("Email de Pablo: "+Pablo.getEmail());*/

        context.close();

    }
}
