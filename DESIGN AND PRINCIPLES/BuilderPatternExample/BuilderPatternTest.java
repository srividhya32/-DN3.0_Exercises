package BuilderPatternExample;

public class BuilderPatternTest {
    public static void main(String[] args) {
        Computer gamingComputer = new Computer.Builder()
                .setCPU("AMD Ryzen 9")
                .setRAM("64GB")
                .setStorage("2TB NVMe SSD")
                .setGPU("NVIDIA RTX 4090")
                .setMotherboard("MSI MEG X570")
                .build();

        Computer officeComputer = new Computer.Builder()
                .setCPU("Intel i7")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGPU("Intel Iris Xe")
                .setMotherboard("ASUS Prime")
                .build();

        Computer homeComputer = new Computer.Builder()
                .setCPU("AMD Ryzen 5")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .setGPU("NVIDIA GTX 1660")
                .setMotherboard("ASRock B450")
                .build();

        System.out.println("Gaming Computer: " + gamingComputer.getCPU() + ", " + gamingComputer.getRAM() + ", " + gamingComputer.getStorage() + ", " + gamingComputer.getGPU() + ", " + gamingComputer.getMotherboard()+"\n");
        System.out.println("Office Computer: " + officeComputer.getCPU() + ", " + officeComputer.getRAM() + ", " + officeComputer.getStorage() + ", " + officeComputer.getGPU() + ", " + officeComputer.getMotherboard()+"\n");
        System.out.println("Home Computer: " + homeComputer.getCPU() + ", " + homeComputer.getRAM() + ", " + homeComputer.getStorage() + ", " + homeComputer.getGPU() + ", " + homeComputer.getMotherboard()+"\n");
    }
}
