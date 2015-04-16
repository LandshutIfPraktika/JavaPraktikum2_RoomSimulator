package Praktikum2;

/**
 * Created by s-gheldd on 4/16/15.
 */
public class Light {
    private boolean on = false;
    private double watts;

    public Light(){
        this(60.0);
    }

    public Light(double watts){
        this.watts = watts;
        this.on = false;
    }

    public boolean isOn() {
        return this.on;
    }

    public void switchOn(){
        if(!this.on){
            this.on = true;
        }
    }

    public void switchOff(){
        if(this.on){
            this.on = false;
        }
    }

    public void renewBulb(double watts){
        if (this.on){
            System.out.println("Light has to be switched off to change Bulb");
        } else {
            this.watts = watts;
        }
    }

    public void print(){
        if (this.on){
            System.out.println("The light is shining with " + this.watts + " watts");
        } else {
            System.out.println("The light is off");
        }
    }
}
