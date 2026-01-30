public class Entity {
    String name;
    int level;
    int heartPoints;

    public Entity(String name, int level, int heartPoints) {
        this.name = name;
        this.level = level;
        this.heartPoints = heartPoints;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHeartPoints() {
        return this.heartPoints;
    }

    public void setHeartPoints(int heartPoints) {
        this.heartPoints = heartPoints;
    }
}
