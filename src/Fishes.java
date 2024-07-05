public class Fishes extends Vertebrates {

    public int layEggs;

    public Fishes(String name, int layEggs) {
        super(name);
        this.layEggs = layEggs;
    }

    public int getLayEggs() {
        return layEggs;
    }

    @Override
    public void print() {
        System.out.println("Name " + getName() );
        System.out.println("Number of eggs laid: " + getLayEggs() );

    }
}
