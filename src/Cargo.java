public class Cargo {

    private String name;
    protected float weight;
    private boolean highRisk;

    public Cargo(String name, float weight) {
        this.name = name;
        this.weight = weight;
        highRisk = false;
    }

    public Cargo(String name, float weight, boolean highRisk) {
        this.name = name;
        this.weight = weight;
        this.highRisk = highRisk;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeight(float weight) {
        this.weight = weight;

    }

    public float getWeight() {
        return weight;
    }

    public void setHighRisk(boolean highRisk) {
        this.highRisk = highRisk;

    }

    public boolean getHighRisk() {
        return highRisk;
    }

    public String toString() {

        return "Name: " + name + ", " + "Weight: " + weight;
    }

}
