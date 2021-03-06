package dungenModel;
import java.util.ArrayList;


public class ItemsPlayerCollection implements java.io.Serializable {

    private ArrayList<Items> playerItems;

    public ItemsPlayerCollection() {
        playerItems = setDefaultPlayerItems();
    }

    public ArrayList<Items> setDefaultPlayerItems() {
        ArrayList<Items> temp = new ArrayList();
        temp.add(new Items("Short Sword", "6 Damage"));
        temp.add(new Items("Healing potion", "Returns hitpoints to max"));
        return temp;
    }

    public ArrayList<Items> getPlayerItems() {
        return playerItems;
    }

    public void setPlayerItems(ArrayList<Items> playerItems) {
        this.playerItems = playerItems;
    }

    public void addItem(Items item) {
        playerItems.add(item);
    }

    @Override
    public String toString() {
        return "ItemsPlayerCollection:\n" + playerItems.toString()+ "\n" ;
    }

}
