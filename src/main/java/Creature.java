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

    public int getSwampMoveCost() {
        return swamp;
    }

    public int getWaterMoveCost() {
        return water;
    }

    public int getTreeMoveCost() {
        return tree;
    }

    public int getPlainMoveCost() {
        return plain;
    }
}
