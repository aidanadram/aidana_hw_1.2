public class Main {
    public static void main(String[] args) {

        Vertebrates object1 = createObject("Reptile");
        Vertebrates  object2 = createObject("Bird");
        Vertebrates object3 = createObject("Fish");

        Printable[] objects = {(Printable) object1, (Printable) object2, (Printable) object3};

        for (Printable obj : objects) {
            obj.print();
            System.out.println();
        }
    }


    public static Vertebrates  createObject(String className) {
        switch (className) {
            case "Reptile":
                return new Reptiles("Snake", 73) ;
            case "Bird":
                return new Birds("Nightingale", 3 );
            case "Fish":
                return new Fishes("Salmon", 17 );
            default:
                throw new IllegalArgumentException("Unknown class name: " + className);
        }

    }





    }
