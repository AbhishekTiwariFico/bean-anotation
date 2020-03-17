package main;

import model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationAccess {
    public static void main(String[] args )
    {
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("hello");
        Employee employee = (Employee)applicationContext.getBean("emp");
        System.out.println(employee);

    }


}
