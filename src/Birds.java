public class Birds extends Vertebrates  {

    public int averageAge;


    public Birds(String name,  int averageAge) {
        super(name);
        this.averageAge = averageAge;
    }

    public int getAverageAge() {
        return averageAge;
    }

    @Override
    public void print() {
        System.out.println("Name " + getName() );
        System.out.println("Average Age " + getAverageAge());

    }
}
