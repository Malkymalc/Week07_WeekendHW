package BaseClasses;

import Interfaces.ISell;

abstract public class Item implements ISell {

    private String name;
    private Enum itemType;
    private Double buyPrice;
    private Double sellPrice;

    public Item(String name, Enum itemType, Double buyPrice, Double sellPrice) {
        this.name = name;
        this.itemType = itemType;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Enum getItemType() {
        return itemType;
    }

    public void setItemType(Enum itemType) {
        this.itemType = itemType;
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

    @Override
    public Double calculateMarkup() {
        return this.sellPrice - this.buyPrice;
    }

    @Override
    public Double calculateMarkupPercentage() {
        return calculateMarkup() / this.buyPrice;
    }
}
