package hoang.designpattern.Human;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 12/1/2016.
 */

public class Person implements Human {
    String name;
    HashMap<Part, Integer> parts;
    public Person(){
        parts=new HashMap<>();
    }
    @Override
    public String des() {
        StringBuilder builder=new StringBuilder();
        for(Map.Entry<Part, Integer> i :parts.entrySet())
        {
            builder.append(i.getKey().getClass().getSimpleName() +" : "+i.getValue() +" \n");
        }
        return builder.toString();
    }
    public void setName(String n)
    {
        name=n;
    }
    public void addPart(Part p)
    {
        parts.put(p,((Integer) parts.get(p))+1);
    }

}
