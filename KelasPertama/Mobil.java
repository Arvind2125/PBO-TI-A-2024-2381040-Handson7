package KelasPertama;

public class Mobil {
    String warna;
    String merk;
    int kecepatanMaks;

    public Mobil(final String warna, String merk, final int kecepatanMaks){
        this.warna = warna;
        this.merk = merk;
        this.kecepatanMaks = kecepatanMaks;
    }

    public void tampilkanInfo(){
        System.out.println("Warna : " + warna);
        System.out.println("Merek : " + merk);
        System.out.println("Kecepatan Maks : " + kecepatanMaks);
    }

    public void berhenti(){
        System.out.println("Mobil " + merk + "Berhenti");
    }

    public void berjalan(){
        System.out.println("Mobil" + merk + "Berhenti");
    }
}
