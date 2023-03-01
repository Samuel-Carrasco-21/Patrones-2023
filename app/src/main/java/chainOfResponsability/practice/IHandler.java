package chainOfResponsability.practice;

public interface IHandler {
    void setNext(IHandler handler);
    IHandler next();

    void reporteFalla(Persona persona,Falla falla);
}
