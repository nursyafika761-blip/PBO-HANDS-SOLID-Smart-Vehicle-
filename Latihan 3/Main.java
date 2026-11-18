public class Main {

    public static void main(String[] args) {

        MobilBensin bensin = new MobilBensin();

        bensin.startEngine();
        bensin.isiBahanBakar();
        bensin.berjalan();

        System.out.println();

        MobilListrik listrik = new MobilListrik();            

        listrik.startEngine();
        listrik.isiBaterai();
        listrik.berjalan();

        System.out.println();

        Sepeda sepeda = new Sepeda();

        sepeda.berjalan();
    }
}