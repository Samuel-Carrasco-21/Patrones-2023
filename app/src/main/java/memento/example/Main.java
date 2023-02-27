package memento.example;

public class Main {
    public static void main(String[] args) {
        GitHub gitHub = new GitHub();
        Git git = new Git();

        Proyect patronesDiseno = new Proyect();
        
        patronesDiseno.setName("Patrones Diseno");
        patronesDiseno.setComment("git init");
        patronesDiseno.setCode("10481");
        patronesDiseno.setUserStoryEnd("User, inProgress");

        patronesDiseno.setComment(patronesDiseno.getComment());
        patronesDiseno.setCode(patronesDiseno.getCode()+"\npublic class docente");
        patronesDiseno.setUserStoryEnd("User, inProgress");

    }
}
