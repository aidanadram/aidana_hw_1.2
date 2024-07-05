public class Reptiles extends Vertebrates {

    public int population;

    public Reptiles(String name, int population) {
        super(name);
        this.population = population;
    }

    public int getPopulation() {
        return population;
    }


    @Override
    public void print() {
        System.out.println("Name " + getName() );
        System.out.println("Population " +getPopulation() );


    }
}
