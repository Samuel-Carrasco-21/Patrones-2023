package abstractFactory.example;

public class VisualStudio extends Ide{

    @Override
    public void cloning() {
        // TODO Auto-generated method stub
        System.out.println("clone - VisualStudio");
    }

    @Override
    public void code() {
        // TODO Auto-generated method stub
        System.out.println("code - VisualStudio");
    }

    @Override
    public void debug() {
        // TODO Auto-generated method stub
        System.out.println("debug - VisualStudio");
    }

    @Override
    public void build() {
        // TODO Auto-generated method stub
        System.out.println("build - VisualStudio");
    }
    
}
