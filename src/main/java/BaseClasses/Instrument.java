package BaseClasses;

import Interfaces.IPlay;
import Interfaces.ISell;

abstract public class Instrument implements IPlay, ISell {
    private String name;
    private String sound;
    private Double buyPrice;
    private Double sellPrice;
    private Enum instrumentType;

    public Instrument(String name, String sound, Double buyPrice, Double sellPrice, Enum instrumentType) {
        this.name = name;
        this.sound = sound;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.instrumentType = instrumentType;
    }

    public String play(){
        return this.sound;
    }

    @Override
    public Double calculateMarkup() {
        return this.sellPrice - this.buyPrice;
    }

    @Override
    public Double calculateMarkupPercentage() {
        return calculateMarkup() / this.buyPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public Double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public Double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public Enum getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(Enum instrumentType) {
        this.instrumentType = instrumentType;
    }
}
