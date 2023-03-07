package visitor.practice;

public class Main {
    public static void main(String[] args) {
        Bolivia bolivia = new Bolivia();
        USA usa = new USA();
        Europa europa = new Europa();

        Turista turista = new Turista();

        bolivia.accept(turista, 150, "dolares y euros");
        usa.accept(turista, 150, "euros y bolivianos");
        europa.accept(turista, 150, "dolares y bolivianos");
    }
}
