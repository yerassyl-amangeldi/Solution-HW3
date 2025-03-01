public class MUDPrototypeDemo {
    public static void main(String[] args) {
        //create builder instance
        SimpleDungeonBuilder builder = new SimpleDungeonBuilder();

        //building a dungeon
        Dungeon dungeon = builder
                .setDungeonName("Crypt of Shadows")
                .addRoom(new Room("Dark Entrance", "A shadowy corridor"))
                .addRoom(new Room("Throne Room", "A shadowy corridor"))
                .addNPC(new NPC("Skeleton Guard", "A sneaky creature", 50))
                .addNPC(new NPC("Shadow King", "A sneaky creature", 50))
                .addTrap("Pitfall Trap")
                .addTreasureRoom(new Room("Gold Vault", "A shadowy corridor"))
                .build();

        System.out.println("Built Dungeon:");           //result
        System.out.println(dungeon);

        //detailed coontent
        System.out.println("Detailed Contents:");
        System.out.println("Rooms: " + dungeon.getRooms());
        System.out.println("NPCs: " + dungeon.getNpcs());
        System.out.println("Traps: " + dungeon.getTraps());
        System.out.println("Treasure Rooms: " + dungeon.getTreasureRooms());

        System.out.println("=== Room Cloning Demo ===");
        Room prototypeRoom = new Room("Dark Hall", "A shadowy corridor");
        Room clonedRoom1 = (Room) prototypeRoom.cloneEntity();
        Room clonedRoom2 = (Room) prototypeRoom.cloneEntity();

        //Modify one clone to demonstrate independence
        clonedRoom1.setDescription("A brightly lit corridor");

        System.out.println("Original: " + prototypeRoom);
        System.out.println("Clone 1: " + clonedRoom1);
        System.out.println("Clone 2: " + clonedRoom2);

        //NPC cloning demonstration with deep cloning
        System.out.println("NPC Cloning Demo");
        NPC prototypeNPC = new NPC("Goblin", "A sneaky creature", 50);
        prototypeNPC.addItem("Rusty Sword");
        prototypeNPC.addItem("Gold Coin");

        NPC clonedNPC1 = (NPC) prototypeNPC.cloneEntity();
        NPC clonedNPC2 = (NPC) prototypeNPC.cloneEntity();

        //Modify one clone's inventory and health
        clonedNPC1.addItem("Magic Ring");
        clonedNPC1.setHealth(30);

        System.out.println("Original: " + prototypeNPC);
        System.out.println("Clone 1: " + clonedNPC1);
        System.out.println("Clone 2: " + clonedNPC2);
    }
}