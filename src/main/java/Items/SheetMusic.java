package Items;

import BaseClasses.Item;
import Enums.ItemType;

public class SheetMusic extends Item {

    public SheetMusic(String name, Enum itemType, Double buyPrice, Double sellPrice) {
        super(name, ItemType.SHEET_MUSIC, buyPrice, sellPrice);
    }


}
