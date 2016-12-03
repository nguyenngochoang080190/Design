package hoang.designpattern.Template;

/**
 * Created by Administrator on 12/1/2016.
 */

public class Person {
    String name;

    public Person() {

    }

    public String des() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getPerson() {
        return this;
    }
}
