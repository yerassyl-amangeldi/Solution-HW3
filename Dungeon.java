//Dungeon.java
import java.util.ArrayList;
import java.util.List;


public class Dungeon {
    private String name;
    private List<Room> rooms;
    private List<NPC> npcs;                       //variables
    private List<String> traps;
    private List<Room> treasureRooms;

    public Dungeon() {
        this.rooms = new ArrayList<>();
        this.npcs = new ArrayList<>();                  //constructor
        this.traps = new ArrayList<>();
        this.treasureRooms = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Room> getRooms() {
        return rooms;
    }
    public List<NPC> getNpcs() {
        return npcs;
    }                                                               //Getters and setters
    public List<String> getTraps() {
        return traps;
    }
    public List<Room> getTreasureRooms() {
        return treasureRooms;
    }


}