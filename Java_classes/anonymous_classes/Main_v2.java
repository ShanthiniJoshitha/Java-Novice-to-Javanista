package anonymous_classes;

import java.util.ArrayList;
import java.util.List;

public class Main_v2 {

    private static List<Home_v2> populateAndGetHomesList() {

        Home_v2 home1 = new Home_v2("brownstone", "New York", 1200, 1000000);
        Home_v2 home2 = new Home_v2("house", "Seattle", 5200, 1500000);
        Home_v2 home3 = new Home_v2("townhome", "Bellevue", 3300, 500000);
        Home_v2 home4 = new Home_v2("condo", "Mumbai", 3500, 1000000);
        Home_v2 home5 = new Home_v2("villa", "Bangalore", 5400, 300000);
        Home_v2 home6 = new Home_v2("mansion", "Palo Alto", 7500, 10000000);

        List<Home_v2> homesList = new ArrayList<>();

        homesList.add(home1);
        homesList.add(home2);
        homesList.add(home3);
        homesList.add(home4);
        homesList.add(home5);
        homesList.add(home6);

        return homesList;
    }

    public static void main(String[] args) {

        List<Home_v2> homesList = populateAndGetHomesList();

        System.out.println("*** Original list: \n" + homesList);

        List<Home_v2> filteredListByPrice = filterByPriceInRange(homesList, 200000, 600000);
        
        List<Home_v2> filteredListBySqrt = filterByAreaSqFtInRange(homesList, 200000, 600000);

        System.out.println("*** Filtered list: \n" + filteredListByPrice);

        System.out.println("*** Filtered list: \n" + filteredListBySqrt);
    }

    private static List<Home_v2> filterByPriceInRange(List<Home_v2> homesList, int low, int high) {

        List<Home_v2> filteredList = new ArrayList<>();

        for (Home_v2 home : homesList) {
            if (home.getPrice() >= low && home.getPrice() < high) {
                filteredList.add(home);
            }
        }

        return filteredList;
    }

    private static List<Home_v2> filterByAreaSqFtInRange(List<Home_v2> homesList, int low, int high) {

        List<Home_v2> filteredList = new ArrayList<>();

        for (Home_v2 home : homesList) {
            if (home.getAreaSqFt() >= low && home.getAreaSqFt() < high) {
                filteredList.add(home);
            }
        }

        return filteredList;
    }

}
