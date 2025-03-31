package anonymous_classes;

public class Main {

    private static void displayCar(Car car) {
        System.out.println("*** Displaying car");
        System.out.println(car);
    }

    private static void displayHome(Home home) {
        System.out.println("*** Displaying home");
        System.out.println(home);
    }

    public static void main(String[] args) {


        Honda civic = new Honda("Civic", 28000, 25);
        Honda city = new Honda("City", 21000, 26);
        Honda jazz = new Honda("Jazz", 19000, 28);

        displayCar(civic);
        displayCar(city);
        displayCar(jazz);

        // Run

        Condo nyCondo = new Condo("New York", "modern", 1000000);
        Condo mumbaiCondo = new Condo("Mumbai", "regency", 500000);
        Condo bostonCondo = new Condo("Boston", "gothic", 1500000);

        displayHome(nyCondo);
        displayHome(mumbaiCondo);
        displayHome(bostonCondo);


        Car camry = new Car() {

            @Override
            public String getMake() {
                return "Toyota";
            }

            @Override
            public String getModel() {
                return "Camry";
            }

            @Override
            public int getPrice() {
                return 30000;
            }

            @Override
            public int getMileage() {
                return 24;
            }

            @Override
            public String toString() {
                return String.format("Make: %s, model: %s, price: %d, mileage: %d",
                        getMake(), getModel(), getPrice(), getMileage());
            }
        };

        System.out.println("Make: " + camry.getMake());
        System.out.println("Model: " + camry.getModel());
        System.out.println("Price: " + camry.getPrice());
        System.out.println("Mileage: " + camry.getMileage());

        displayCar(camry);

        Home townhome = new Home() {

            @Override
            public String getCity() {
                return "Palo Alto";
            }

            @Override
            public int getNumberOfFloors() {
                return 2;
            }

            @Override
            public String getArchitecturalStyle() {
                return "Tudor";
            }

            @Override
            public int getPrice() {
                return 765000;
            }

            @Override
            public String toString() {
                return String.format("City: %s, Number of floors: %s, style: %s, price: %d",
                        getCity(), getNumberOfFloors(), getArchitecturalStyle(), getPrice());
            }
        };

        System.out.println("City: " + townhome.getCity());
        System.out.println("Number of floors: " + townhome.getNumberOfFloors());
        System.out.println("Architectural style: " + townhome.getArchitecturalStyle());
        System.out.println("Price: " + townhome.getPrice());

        // Run

        displayHome(townhome);
    }

}
