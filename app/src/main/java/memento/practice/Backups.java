package memento.practice;

import java.util.HashMap;
import java.util.Map;

public class Backups {
    private Map<String,Memento> backupsBD = new HashMap<>();

    public void createBackup(String alias, Memento memento){
        System.out.println("\nAlias: "+alias);
        backupsBD.put(alias, memento);
    }

    public Memento getBackupBD(String alias) throws Exception {
        if(!backupsBD.containsKey(alias)){
            throw new Exception("ERROR! el commit no el backup: "+alias);
        }
        System.out.println("\nAlias: "+alias);
        return backupsBD.get(alias);
    }
}
