public class MobilListrik
    implements EnginePowered, Rechargeable, Rideable {

    @Override
    public void startEngine() {
        System.out.println("Sistem mobil listrik dinyalakan.");
    }

    @Override
    public void isiBaterai() {
        System.out.println("Mengisi baterai mobil listrik.");
    }

    @Override
    public void berjalan() {
        System.out.println("Mobil listrik berjalan.");
    }
}