package Items;

import BaseClasses.Item;
import Enums.ItemType;

public class Tuner extends Item {

    public Tuner(String name, Enum itemType, Double buyPrice, Double sellPrice) {
        super(name, ItemType.TUNERS, buyPrice, sellPrice);
    }
}
