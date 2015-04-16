package Praktikum2;

/**
 * Created by s-gheldd on 4/16/15.
 */
public class Room {
    private Bed bed;
    private Light mainLamp;
    private Light bedsideLamp;
    private Cabinet wardrobe;
    private Cabinet bedsideCabinet;
    private Cabinet locker;

    public Room(){
        this(Manufacturer.IKEA,100,60,Manufacturer.IKEA,Manufacturer.IKEA,Manufacturer.IKEA);
    }

    public Room(Bed bed, Light mainLamp, Light bedsideLamp, Cabinet wardrobe, Cabinet bedsideCabinet, Cabinet locker){
        this.bed = bed;
        this.mainLamp = mainLamp;
        this.bedsideLamp = bedsideLamp;
        this.wardrobe = wardrobe;
        this.bedsideCabinet = bedsideCabinet;
        this.locker = locker;
    }

    public Room(Manufacturer manufacturerBed, double wattsMainLamp, double wattsBedsideLamp,
                Manufacturer manufacturerWardrobe, Manufacturer manufacturerBedsideCabinet, Manufacturer manufacturerLocker){
        this(new Bed(manufacturerBed), new Light(wattsMainLamp), new Light(wattsBedsideLamp), new Cabinet(manufacturerWardrobe),
                new Cabinet(manufacturerBedsideCabinet), new Cabinet(manufacturerLocker));
    }

    public Bed getBed() {
        return bed;
    }

    public Light getMainLamp() {
        return mainLamp;
    }

    public Light getBedsideLamp() {
        return bedsideLamp;
    }

    public Cabinet getWardrobe() {
        return wardrobe;
    }

    public Cabinet getBedsideCabinet() {
        return bedsideCabinet;
    }

    public Cabinet getLocker() {
        return locker;
    }

    public void print(){
        this.bed.print();
        this.mainLamp.print();
        this.bedsideLamp.print();
        this.wardrobe.print();
        this.bedsideCabinet.print();
        this.locker.print();
    }
}
