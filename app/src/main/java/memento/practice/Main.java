package memento.practice;

import java.util.Vector;

public class Main {
    static int numPersona = 6;
    public static void main(String[] args) throws Exception {
        Vector<Personas> personas = new Vector<Personas>();
        Backups backups = new Backups();
        BaseDatos baseDatos = new BaseDatos();

        Personas p1 = new Personas();
        p1.setName("persona 1");
        p1.setEdad(18);
        p1.setCi(1029);

        Personas p2 = new Personas();
        p2.setName("persona 2");
        p2.setEdad(21);
        p2.setCi(2029);

        Personas p3 = new Personas();
        p3.setName("persona 3");
        p3.setEdad(24);
        p3.setCi(3029);

        Personas p4 = new Personas();
        p4.setName("persona 4");
        p4.setEdad(25);
        p4.setCi(4029);

        Personas p5 = new Personas();
        p5.setName("persona 5");
        p5.setEdad(26);
        p5.setCi(5029);
        
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);
        personas.add(p5);

        baseDatos.setPersonas(personas);
        backups.createBackup("backupenero", baseDatos.createBackupBD());

        //backup de Enero
        baseDatos.checkPersonas(backups.getBackupBD("backupenero"));

        baseDatos.showPeople();

        agregarPersonasRapido(5,personas);
        baseDatos.setPersonas(personas);
        backups.createBackup("backupfebrero", baseDatos.createBackupBD());
        baseDatos.showPeople();

        // baseDatos.checkPersonas(backups.getBackupBD("backupfebrero"));

        agregarPersonasRapido(10,personas);
        baseDatos.setPersonas(personas);
        backups.createBackup("backupmarzo", baseDatos.createBackupBD());
        baseDatos.showPeople();

        
        agregarPersonasRapido(5,personas);
        baseDatos.setPersonas(personas);
        backups.createBackup("backupabril", baseDatos.createBackupBD());
        baseDatos.showPeople();

        agregarPersonasRapido(25,personas);
        baseDatos.setPersonas(personas);
        backups.createBackup("backupmayo", baseDatos.createBackupBD());
        baseDatos.showPeople();

        Vector<Personas> bpFebrero = new Vector<>();
        bpFebrero.addAll(baseDatos.checkPersonas(
            backups.getBackupBD("backupfebrero")));
        
        baseDatos.setPersonas(bpFebrero);

        baseDatos.showPeople();

    }

    public static int generarEdad(){
        return (int)(Math.random()*100);
    }

    public static int generarCi(){
        return (int)(Math.random()*100000);
    }

    public static Personas generarPersona(){
        Personas pX = new Personas();
        pX.setEdad(generarEdad());
        pX.setCi(generarCi());
        pX.setName("persona "+numPersona);
        numPersona++;
        return pX;
    }

    public static void agregarPersonasRapido(int n, Vector<Personas> people){
        for(int i=0;i<n;i++){
            people.add(generarPersona());
        }
    }
}

