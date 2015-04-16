package Praktikum2;

import java.time.Clock;
import java.time.Instant;

/**
 * Created by Georg on 15.04.2015.
 */
public class Bed {
    private boolean made = false;
    private boolean covered = false;
    private Instant timeOfManufacture;
    private Manufacturer manufacturer;

    private static Clock clock = Clock.systemUTC();


    public Bed(Manufacturer manufacturer){
        this.manufacturer = manufacturer;
        this.timeOfManufacture  = clock.instant();
    }

    public Bed(){
        this(Manufacturer.IKEA);
    }

    public boolean isCovered() {
        return covered;
    }

    public boolean isMade() {
        return made;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void doBed(){
        if (!this.made){
            this.made = true;
        }
    }

    public void use(){
        if(this.made&&this.covered) {
            this.made = false;
        }
    }

    public void uncoverBed(){
        if(this.covered){
            this.covered = false;
        }
    }

    public void coverBed(){
        if(!this.covered){
            this.covered = true;
        }
    }

    public void print(){
        System.out.println("This bed was manufactured by " + this.manufacturer + " on "+ this.timeOfManufacture);
        if (this.covered){
            System.out.print("It is currently covered and ");
            if (this.made){
                System.out.print("made \n");
            } else {
                System.out.print("unmade \n");
            }

        } else {
            System.out.println("It is currently uncovered");
        }
    }

}
