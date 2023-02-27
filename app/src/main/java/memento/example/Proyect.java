package memento.example;

public class Proyect {
    private String name;
    private String comment;
    private String code;
    private String userStoryEnd;
    
    public Proyect setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public Proyect setCode(String code) {
        this.code = code;
        return this;
    }
    public Proyect setUserStoryEnd(String userStoryEnd){
        this.userStoryEnd = userStoryEnd;
        return this;
    }
    public Proyect setName(String name){
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    public String getComment() {
        return comment;
    }
    public String getCode() {
        return code;
    }
    public String getUserStoryEnd() {
        return userStoryEnd;
    }

    public void showInfo(){
        System.out.println("-----------");
        System.out.println("name: "+this.getName());
        System.out.println("comment: "+this.getComment());
        System.out.println("code: "+this.getCode());
        System.out.println("user story end: "+this.getUserStoryEnd());
        System.out.println("-----------");
    }


}
