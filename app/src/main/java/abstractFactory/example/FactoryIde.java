package abstractFactory.example;

public class FactoryIde {
    public static Ide make(String type){
        Ide ide;
        switch(type.toLowerCase()){
            case "eclipse":
                ide = new Eclipse();
                break;
            case "vscode":
                ide = new VSCode();
                break;
            case "visualstudio":
                ide = new VisualStudio();
                break;
            case "intellij":
                ide = new IntelliJ();
                break;
            default:
                ide = new VSCode();
                break;
        }
        return ide;
    }
}
