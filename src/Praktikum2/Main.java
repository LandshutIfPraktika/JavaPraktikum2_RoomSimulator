package Praktikum2;

public class Main {

    public static void main(String[] args) {
        Bed myBed = new Bed(Manufacturer.ROLFBENZ);
        myBed.coverBed();
        myBed.doBed();
        myBed.print();
        myBed.use();
        myBed.print();
        Cabinet myCabinet = new Cabinet(Manufacturer.XXXLUTZ);
        myCabinet.open();
        myCabinet.print();
    }
}
