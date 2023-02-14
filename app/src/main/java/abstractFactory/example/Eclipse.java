package abstractFactory.example;

public class Eclipse extends Ide{

    @Override
    public void cloning() {
        // TODO Auto-generated method stub
        System.out.println("clone - Eclipse");
        
    }

    @Override
    public void code() {
        // TODO Auto-generated method stub
        System.out.println("code - Eclipse");
    }

    @Override
    public void debug() {
        // TODO Auto-generated method stub
        System.out.println("debug - Eclipse");
    }

    @Override
    public void build() {
        // TODO Auto-generated method stub
        System.out.println("build - Eclipse");
    }
    
}
