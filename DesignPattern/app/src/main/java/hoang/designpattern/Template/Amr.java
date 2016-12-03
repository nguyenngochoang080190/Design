package hoang.designpattern.Template;

/**
 * Created by Administrator on 12/1/2016.
 */

public class Amr extends Component {
    Person person;
    public Amr(Person p) {
        person=p;
    }

    @Override
    public String des() {
        return person.des()+" have a amr";
    }
}
