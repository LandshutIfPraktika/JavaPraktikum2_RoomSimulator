package Praktikum2;

public class Main {

    public static void main(String[] args) {
        Bed myBed = new Bed(Manufacturer.ROLFBENZ);
        myBed.coverBed();
        myBed.print();
    }
}
