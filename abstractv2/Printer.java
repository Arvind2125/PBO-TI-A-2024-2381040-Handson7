package abstractv2;

public class Printer implements cetak{

    @Override
    public void print() {
        System.out.println("Mencetak Dokumen.........");
    }
    @Override
    public void scan(){
        System.out.println("Meemindai Ddokumen........");
    }
}
