package pl.pjatk.micjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FirstClass {

    @Autowired
    private SecondClass second;

    private String name;

    public SecondClass getSecond() {
        return second;
    }

    public FirstClass(SecondClass secondClass) {
        this.second = secondClass;
        System.out.println("Hello i'm first class");
    }

    public void helloFirst() {
        System.out.println("FIRST say hi");
    }

    public void setSecond(SecondClass second) {
        this.second = second;
    }

    public void sayHI(){

    }
}
