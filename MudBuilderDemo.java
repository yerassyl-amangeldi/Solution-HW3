public class MUDBuilderDemo {
    public static void main(String[] args) {
        //create builder instance
        SimpleDungeonBuilder builder = new SimpleDungeonBuilder();

        //building a dungeon
        Dungeon dungeon = builder
                .setDungeonName("Crypt of Shadows")
                .addRoom(new Room("Dark Entrance"))
                .addRoom(new Room("Throne Room"))
                .addNPC(new NPC("Skeleton Guard"))
                .addNPC(new NPC("Shadow King"))
                .addTrap("Pitfall Trap")
                .addTreasureRoom(new Room("Gold Vault"))
                .build();

        System.out.println("Built Dungeon:");           //result
        System.out.println(dungeon);

        //detailed coontent
        System.out.println("Detailed Contents:");
        System.out.println("Rooms: " + dungeon.getRooms());
        System.out.println("NPCs: " + dungeon.getNpcs());
        System.out.println("Traps: " + dungeon.getTraps());
        System.out.println("Treasure Rooms: " + dungeon.getTreasureRooms());
    }
}