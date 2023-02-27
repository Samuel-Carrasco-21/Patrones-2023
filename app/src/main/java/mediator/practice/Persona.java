package mediator.practice;

public abstract class Persona {
    protected ICanalComunicacion canalComunication;

    private String name;
    public String getName() {
        return name;
    }
    public Persona setName(String name) {
        this.name = name;
        return this;
    }

    private int ci;
    public int getCi() {
        return ci;
    }
    public Persona setCi(int ci) {
        this.ci = ci;
        return this;
    }

    private String cargo;
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public Persona(String name, int ci, ICanalComunicacion iCanalComunicacion) {
        this.canalComunication = iCanalComunicacion;
        this.name = name;
        this.ci = ci;
    }

    public abstract void send(String msg);
    public abstract void received(String msg);
}
