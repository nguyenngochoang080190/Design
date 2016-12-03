package hoang.designpattern.Human;

/**
 * Created by Administrator on 12/1/2016.
 */

public class PersonWithArm extends Part {
    Person person;
    public PersonWithArm(Person p)
    {
        person=p;
    }
    @Override
    public String des() {
        return person.des()+" have a ARM,";
    }
}
