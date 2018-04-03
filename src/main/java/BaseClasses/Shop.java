package BaseClasses;

import Interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name, ArrayList<ISell> stock) {
        this.name = name;
        this.stock = stock;
    }

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public void addItem(ISell item){
        stock.add(item);
    }

    public void removeItem(ISell item){
        stock.remove(item);
    }

    public Double totalPotentialProfit(){
        Double totalPotentialProfit = 0.00;
        for (ISell item: stock) {
            totalPotentialProfit += item.calculateMarkup();
        }
        return totalPotentialProfit;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStock(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }
}
