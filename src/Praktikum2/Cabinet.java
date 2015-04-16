package Praktikum2;

import java.time.Clock;
import java.time.Instant;

/**
 * Created by s-gheldd on 4/16/15.
 */
public class Cabinet {
    private Manufacturer manufacturer;
    private Instant timeOfManufacture;
    private Boolean open;

    private static Clock clock = Clock.systemUTC();

    public Cabinet(){
        this(Manufacturer.IKEA);
    }

    public Cabinet(Manufacturer manufacturer){
        this.manufacturer = manufacturer;
        this.timeOfManufacture = clock.instant();
        open = false;
    }

    public Boolean isOpen() {
        return this.open;
    }

    public Manufacturer getManufacturer(){
        return  this.manufacturer;
    }

    private void setManufacturer(Manufacturer manufacturer){
        this.manufacturer = manufacturer;
    }

    public void open(){
        if (!this.open){
            this.open = true;
        }
    }

    public void close(){
        if (this.open){
            this.open = false;
        }
    }

    public void print(){
        System.out.println("This Cabinet was manufactured by " + this.manufacturer + " on "+ this.timeOfManufacture);
        if (this.open){
            System.out.println("It is currently open");
        } else {
            System.out.println("It is currently closed");
        }
    }
}