public class Creature {
    private String race;
    private int swamp;
    private int water;
    private int tree;
    private int plain;

    public Creature(String race, int swamp, int water, int tree, int plain) {
        this.race = race;
        this.swamp = swamp;
        this.water = water;
        this.tree = tree;
        this.plain = plain;
    }

    public String getRace() {
        return race;
    }

    public int getSwamp() {
        return swamp;
    }

    public int getWater() {
        return water;
    }

    public int getTree() {
        return tree;
    }

    public int getPlain() {
        return plain;
    }
}
