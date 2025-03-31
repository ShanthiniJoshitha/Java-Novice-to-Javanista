package lambda_functions;

import java.util.ArrayList;
import java.util.List;

public class Main_v2 {

    private static List<Car> populateAndGetCarsList() {

        Car car1 = new Car("Honda", "Acura", 23000, 24);
        Car car2 = new Car("Honda", "Civic", 25000, 27);
        Car car3 = new Car("Toyota", "Camry", 33000, 22);
        Car car4 = new Car("Tesla", "Model S", 83000, 34);

        List<Car> carsList = new ArrayList<>();

        carsList.add(car1);
        carsList.add(car2);
        carsList.add(car3);
        carsList.add(car4);

        return carsList;
    }

    private static List<Home> populateAndGetHomesList() {

        Home home1 = new Home("brownstone", "New York", 1200, 1000000);
        Home home2 = new Home("house", "Seattle", 5200, 1500000);
        Home home3 = new Home("townhome", "Bellevue", 3300, 500000);
        Home home4 = new Home("condo", "Bellevue", 3500, 1000000);
        Home home5 = new Home("villa", "Bangalore", 5400, 300000);
        Home home6 = new Home("mansion", "Seattle", 7500, 10000000);

        List<Home> homesList = new ArrayList<>();

        homesList.add(home1);
        homesList.add(home2);
        homesList.add(home3);
        homesList.add(home4);
        homesList.add(home5);
        homesList.add(home6);

        return homesList;
    }

    private static <T> List<T> filter(List<T> elementList, Filter<T> filter) {

        List<T> filteredList = new ArrayList<>();

        for (T element : elementList) {
            if (filter.test(element)) {
                filteredList.add(element);
            }
        }

        return filteredList;
    }

    public static void main(String[] args) {

        List<Car> carsList = populateAndGetCarsList();

        List<Car> filteredCarList = filter(carsList,
                car -> (car.getPrice() < 30000 && car.getMileage() > 20));

        System.out.println("*** Filtered car list: \n" + filteredCarList);

        List<Home> homesList = populateAndGetHomesList();

        List<Home> filteredHomeList = filter(homesList,
                home -> (home.getAreaSqFt() > 3000 &&
                        home.getAreaSqFt() < 5500 &&
                        home.getCity().equals("Bellevue")));

        System.out.println("*** Filtered list: \n" + filteredHomeList);
    }

}
