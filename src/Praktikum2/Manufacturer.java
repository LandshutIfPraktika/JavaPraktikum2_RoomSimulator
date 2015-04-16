package Praktikum2;

/**
 * Created by Georg on 15.04.2015.
 * U+00A9 all tights reserved
 */
public enum Manufacturer { IKEA, XXXLUTZ, ROLFBENZ, UNKNOWN;


    public String toString(){
        switch(this){

            case IKEA:
                return "Ikea";
            case XXXLUTZ:
                return "XXXLutz";
            case ROLFBENZ:
                return "Rolf-Benz";
            case UNKNOWN:
                return "unknown/self-made";
        }
        return "";
    }
}
