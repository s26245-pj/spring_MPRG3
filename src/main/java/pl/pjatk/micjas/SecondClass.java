package pl.pjatk.micjas;

import org.springframework.stereotype.Component;

@Component
public class SecondClass {

    public SecondClass() {
        System.out.println("hello i'm second class");
    }

    public void helloSecond() {
        System.out.println("SECOND say HI!");
    }

}
