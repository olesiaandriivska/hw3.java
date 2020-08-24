package hw3.part4;

public class Leptop extends Computer {
    private int memory;
    private  String videoCard;

    public Leptop() {
        super();
    }

    public Leptop(String model, double size, int memory, String videoCard) {
        super(model, size);
        this.memory = memory;
        this.videoCard = videoCard;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    @Override
    public String toString() {
        return "Leptop{" +
                "memory=" + memory +
                ", videoCard='" + videoCard + '\'' +
                '}';
    }

    public void leptop(){
        System.out.println("This is my leptop!");
    }
}
