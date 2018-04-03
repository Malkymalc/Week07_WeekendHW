package Instruments;

import BaseClasses.Instrument;

public class Trumpet extends Instrument {
    public Trumpet(String name, String sound, Double buyPrice, Double sellPrice, Enum instrumentType) {
        super(name, sound, buyPrice, sellPrice, instrumentType);
    }
}
