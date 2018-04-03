package Items;

import BaseClasses.Item;
import Enums.ItemType;

public class Strings extends Item {

    public Strings(String name, Double buyPrice, Double sellPrice) {
        super(name, ItemType.STRINGS, buyPrice, sellPrice);
    }


}
