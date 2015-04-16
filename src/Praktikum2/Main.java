package Praktikum2;

public class Main {

    public static void main(String[] args) {
        Room myRoom = new Room(Manufacturer.ROLFBENZ,120,60,Manufacturer.XXXLUTZ,Manufacturer.IKEA,Manufacturer.IKEA);
        myRoom.getBedsideLamp().switchOn();
        myRoom.getBed().coverBed();
        myRoom.getBed().doBed();
        myRoom.getLocker().open();
        myRoom.print();

    }
}
