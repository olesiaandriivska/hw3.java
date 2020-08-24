package hw3.part5;

public class String2 implements Interface {

    private String meaasge;

    public String2() {
    }

    public String2(String meaasge) {
        this.meaasge = meaasge;
    }

    @Override
    public String toString() {
        return "String2{" +
                "meaasge='" + meaasge + '\'' +
                '}';
    }

    @Override
    public void scream() {
        System.out.println("ууууууууу");
    }
}
