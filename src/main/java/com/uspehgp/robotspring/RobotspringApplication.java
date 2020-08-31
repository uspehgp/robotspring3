package com.uspehgp.robotspring;

import com.uspehgp.robotspring.impls.robot.ModelT1000;
import com.uspehgp.robotspring.interfaces.Robot;
import com.uspehgp.robotspring.interfaces.RobotConveyor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class RobotspringApplication {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
//        System.out.println(t1000);
//        t1000 = (ModelT1000) context.getBean("t1000");
//        System.out.println(t1000);
//        t1000.dance();
 //       t1000.action();

        RobotConveyor t1000Conveyor = (RobotConveyor) context.getBean("t1000Conveyor");

        Robot terminator1 = t1000Conveyor.createRobot();
        Robot terminator2 = t1000Conveyor.createRobot();
        Robot terminator3 = t1000Conveyor.createRobot();

        System.out.println("terminator1 - " + terminator1);
        System.out.println("terminator2 - " + terminator2);
        System.out.println("terminator3 - " + terminator3);

        ((ConfigurableApplicationContext)context).close();

        //SpringApplication.run(RobotspringApplication.class, args);
    }

}
