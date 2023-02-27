package mediator.practice;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Skype skype = new Skype();

        Dev dev1 = new Dev("developer 1", 1000, "C++", skype);
        Dev dev2 = new Dev("developer 2", 2000, "Python", skype);
        Dev dev3 = new Dev("developer 3", 3000, "Java", skype);

        Vector<String> certificaciones = new Vector<>();

        certificaciones.add("Scrum Alliance");
        certificaciones.add("Scrum ORG");
        ScrumMaster scrumMaster1 = 
        new ScrumMaster("scrum master 1", 4000, certificaciones, skype);
        certificaciones.clear();

        certificaciones.add("PMI");
        certificaciones.add("Scrum ORG");
        ScrumMaster scrumMaster2 = 
        new ScrumMaster("scrum master 2", 5000, certificaciones, skype);
        certificaciones.clear();

        certificaciones.add("PMI");
        certificaciones.add("Scrum Alliance");
        ScrumMaster scrumMaster3 = 
        new ScrumMaster("scrum master 3", 6000, certificaciones, skype);
        certificaciones.clear();

        QA qa1 = new QA("qa 1", 7000, "junior", skype);
        QA qa2 = new QA("qa 2", 8000, "semi senior", skype);
        QA qa3 = new QA("qa 3", 9000, "senior", skype);

        skype.addProfesionalToTheChat(dev1);
        skype.addProfesionalToTheChat(dev2);
        skype.addProfesionalToTheChat(dev3);
        skype.addProfesionalToTheChat(scrumMaster1);
        skype.addProfesionalToTheChat(scrumMaster2);
        skype.addProfesionalToTheChat(scrumMaster3);
        skype.addProfesionalToTheChat(qa1);
        skype.addProfesionalToTheChat(qa2);
        skype.addProfesionalToTheChat(qa3);

        qa1.send("Hola a todos los QA!");
        dev3.send("Hola a todos los DEV!");
        scrumMaster1.send("Hola a todo el personal!");
    }
}
