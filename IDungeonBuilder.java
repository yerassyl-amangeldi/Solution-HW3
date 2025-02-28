//IDungeonBuilder.java
public interface IDungeonBuilder {
    IDungeonBuilder setDungeonName(String name);
    IDungeonBuilder addRoom(Room room);
    IDungeonBuilder addNPC(NPC npc);                    //variables
    IDungeonBuilder addTrap(String trapDescription);
    IDungeonBuilder addTreasureRoom(Room treasureRoom);
    Dungeon build();
}