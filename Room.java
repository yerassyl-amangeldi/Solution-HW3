public class Room implements ClonableGameEntity {
    private String name;
    private String description;

    public Room(String name, String s) {
        this.name = name;
        this.description = description;
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

    @Override
    public ClonableGameEntity cloneEntity() {
        try {
            return (Room) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Room(this.name, "A shadowy corridor");

        }
    }



}
