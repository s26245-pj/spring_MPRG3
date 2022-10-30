package pl.pjatk.micjas;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ThirdClass {

    ApplicationContext applicationContext;


    public ThirdClass(ApplicationContext applicationContext){
        System.out.println("hello i'm third class");
        this.applicationContext = applicationContext;

        FirstClass first = applicationContext.getBean("firstClass", FirstClass.class);
        SecondClass second = applicationContext.getBean("secondClass", SecondClass.class);

        first.helloFirst();
        second.helloSecond();
    }
}
