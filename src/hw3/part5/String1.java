package hw3.part5;

public class String1 implements Interface {

    private String meaasge;

    public String1() {
    }

    public String1(String meaasge) {
        this.meaasge = meaasge;
    }

    @Override
    public String
    toString() {
        return "String1{" +
                "meaasge='" + meaasge + '\'' +
                '}';
    }

    @Override
    public void scream() {
        System.out.println("аааааааа!!!!!");
    }
}
