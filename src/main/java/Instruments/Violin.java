package Instruments;

import BaseClasses.Instrument;

public class Violin extends Instrument {
    public Violin(String name, String sound, Double buyPrice, Double sellPrice, Enum instrumentType) {
        super(name, sound, buyPrice, sellPrice, instrumentType);
    }
}
