//SimpleDungeonBuilder.java
public class SimpleDungeonBuilder implements IDungeonBuilder {
    private Dungeon dungeon;                //variable

    public SimpleDungeonBuilder() {
        this.dungeon = new Dungeon();       //constructor
    }

    @Override
    public IDungeonBuilder setDungeonName(String name) {
        dungeon.setName(name);
        return this;
    }

    @Override
    public IDungeonBuilder addRoom(Room room) {
        dungeon.getRooms().add(room);
        return this;
    }

    @Override
    public IDungeonBuilder addNPC(NPC npc) {    //implements
        dungeon.getNpcs().add(npc);
        return this;
    }

    @Override
    public IDungeonBuilder addTrap(String trapDescription) {
        dungeon.getTraps().add(trapDescription);
        return this;
    }

    @Override
    public IDungeonBuilder addTreasureRoom(Room treasureRoom) {
        dungeon.getTreasureRooms().add(treasureRoom);
        return this;
    }

    @Override
    public Dungeon build() {
        return dungeon;
    }
}