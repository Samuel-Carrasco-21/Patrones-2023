package iterator.template;

public class ConcreteIteratorA implements Iterator{

    private String [] names;
    private int position = 0;

    public ConcreteIteratorA(String [] names){
        this.names = names;
    }

    @Override
    public Object next() {
        // TODO Auto-generated method stub
        return this.names[position++];
    }

    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        return this.names.length != 0 && position < this.names.length;
    }
    
}
