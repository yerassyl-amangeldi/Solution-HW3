import java.util.List;
import java.util.ArrayList;

public class NPC implements ClonableGameEntity, Cloneable{
    private String name;
    private String description;
    private int health;
    private List<String> inventory;



    public NPC(String name, String s, int i) {
        this.name = name;
        this.description = description;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public List<String> getInventory() {
        return inventory;
    }

    public void setInventory(List<String> inventory) {
        this.inventory = inventory;
    }


    @Override
    public ClonableGameEntity cloneEntity() {
        try {
            NPC clone = (NPC) super.clone();
            clone.inventory = new ArrayList<>(this.inventory);
            return clone;                                                           //deep cloning of the inventory list
        } catch (CloneNotSupportedException e) {
            NPC clone = new NPC(this.name, "A sneaky creature", 50);
            clone.inventory.addAll(this.inventory);
            return clone;
        }
    }
}
