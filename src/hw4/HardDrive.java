package hw4;

public class HardDrive {
    private String modelHardDrive;
    private TypeHardDrive typeHardDrive;
    private int volumeHardDrive;
    private Country country;

    public HardDrive() {
    }

    public HardDrive(String modelHardDrive, TypeHardDrive typeHardDrive, int volumeHardDrive, Country country) {
        this.modelHardDrive = modelHardDrive;
        this.typeHardDrive = typeHardDrive;
        this.volumeHardDrive = volumeHardDrive;
        this.country = country;
    }

    public String getModelHardDrive() {
        return modelHardDrive;
    }

    public void setModelHardDrive(String modelHardDrive) {
        this.modelHardDrive = modelHardDrive;
    }

    public TypeHardDrive getTypeHardDrive() {
        return typeHardDrive;
    }

    public void setTypeHardDrive(TypeHardDrive typeHardDrive) {
        this.typeHardDrive = typeHardDrive;
    }

    public int getVolumeHardDrive() {
        return volumeHardDrive;
    }

    public void setVolumeHardDrive(int volumeHardDrive) {
        this.volumeHardDrive = volumeHardDrive;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "modelHardDrive='" + modelHardDrive + '\'' +
                ", typeHardDrive=" + typeHardDrive +
                ", volumeHardDrive=" + volumeHardDrive +
                ", country=" + country +
                '}';
    }
}
