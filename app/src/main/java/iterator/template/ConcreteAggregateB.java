package iterator.template;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregateB  implements IAggregate{
    private String Attribute1;
    public String getAttribute1() {
        return Attribute1;
    }
    public void setAttribute1(String attribute1) {
        Attribute1 = attribute1;
    }

    private String Attribute2;
    public String getAttribute2() {
        return Attribute2;
    }
    public void setAttribute2(String attribute2) {
        Attribute2 = attribute2;
    }

    private String Attribute3;
    public String getAttribute3() {
        return Attribute3;
    }
    public void setAttribute3(String attribute3) {
        Attribute3 = attribute3;
    }

    private List<String> names;
    public List<String> getNames() {
        return names;
    }
    public void setNames(List<String> names) {
        this.names = names;
    }
    public ConcreteAggregateB(){
        names = new ArrayList<>();
    }

    @Override
    public Iterator createIterator() {
        // TODO Auto-generated method stub
        return null;

    }
}
