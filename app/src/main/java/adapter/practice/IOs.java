package adapter.practice;

public class IOs implements IMobile{
    private String branch;
    private int phoneNumber;
    private String model;

    public IOs(String model){
        this.model = model;
        setBranch_PhoneNumber();
    }

    @Override
    public void login() {
        System.out.println("\n--- Action Mobile ---");
        System.out.println("Login Android");
    }

    @Override
    public void logout() {
        System.out.println("\n--- Action Mobile ---");
        System.out.println("Logout Android");
    }

    @Override
    public void reportes() {
        System.out.println("\n--- Action Mobile ---");
        System.out.println("Making reports Android");
    }

    @Override
    public void infoMob() {
        System.out.println("\n--- Phone ---");
        System.out.println("Branch: "+branch);
        System.out.println("Phone number: "+phoneNumber);
        System.out.println("Model: "+model);
    }

    @Override
    public void setBranch_PhoneNumber() {
        this.branch = "Apple";
        this.phoneNumber = (int)(Math.random()*10000000);
    }

}
