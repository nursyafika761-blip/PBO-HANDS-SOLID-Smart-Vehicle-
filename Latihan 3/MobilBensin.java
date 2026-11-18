public class MobilBensin
    implements EnginePowered, Fuelable, Rideable {

    @Override
    public void startEngine() {
        System.out.println("Mesin mobil bensin dinyalakan.");
    }

    @Override
    public void isiBahanBakar() {
        System.out.println("Mengisi bahan bakar mobil.");
    }

    @Override
    public void berjalan() {
        System.out.println("Mobil bensin berjalan.");
    }
}