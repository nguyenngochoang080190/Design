package hoang.designpattern.Template;

/**
 * Created by Administrator on 12/1/2016.
 */

public class Face extends Component {
    Person person;
    public Face(Person p) {
        person=p;
    }

    @Override
    public String des() {
        return person.des()+" have a foot";
    }
}
