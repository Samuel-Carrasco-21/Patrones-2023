package chainOfResponsability.practice;

public class Persona {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    private String email;
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    private String userName;
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Persona(String name, String email, String userName) {
        this.name = name;
        this.email = email;
        this.userName = userName;
    }

    public void showInfo() {
        System.out.println("--- Info ---");
        System.out.println("Nombre: "+this.getName());
        System.out.println("Email: "+this.getEmail());
        System.out.println("User Name: "+this.getUserName());
    }
    
}
