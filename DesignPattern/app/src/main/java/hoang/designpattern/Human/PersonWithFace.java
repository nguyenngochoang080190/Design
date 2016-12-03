package hoang.designpattern.Human;

/**
 * Created by Administrator on 12/1/2016.
 */

public class PersonWithFace extends Part {
    Person person;

    public PersonWithFace(Person p)
    {
        person=p;
    }
    @Override
    public String des() {
        return person.des()+" with FACE, ";
    }
}
