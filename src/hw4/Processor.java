package hw4;

public class Processor {
    private String typeProcessor;
    private int numberOfCores;
    private int frequency;
    private Country country;

    public Processor() {
    }

    public Processor(String typeProcessor, int numberOfCores, int frequency, Country country) {
        this.typeProcessor = typeProcessor;
        this.numberOfCores = numberOfCores;
        this.frequency = frequency;
        this.country = country;
    }

    public String getTypeProcessor() {
        return typeProcessor;
    }

    public void setTypeProcessor(String typeProcessor) {
        this.typeProcessor = typeProcessor;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "typeProcessor='" + typeProcessor + '\'' +
                ", numberOfCores=" + numberOfCores +
                ", frequency=" + frequency +
                ", country=" + country +
                '}';
    }
}
