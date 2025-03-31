package anonymous_classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main_v1 {

    public static void main(String[] args) {

        List<Integer> numbersList = new ArrayList<>();

        numbersList.add(234);
        numbersList.add(9876);
        numbersList.add(100);
        numbersList.add(34);
        numbersList.add(-23);

        System.out.println("**Before sorting: " + numbersList);

        Collections.sort(numbersList);

        System.out.println("**After sorting: " + numbersList);

        System.out.println("Comparable interfaces: ");

        System.out.println("**Before sorting: " + numbersList);

        Comparator<Integer> descendingComparator = new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2) * -1;
            }
        };


        Collections.sort(numbersList, descendingComparator);

        System.out.println("**After sorting: " + numbersList);

        System.out.println("Sorting our own objects: ");

        Home_v1 home1 = new Home_v1("townhome", "Seattle", 2345);
        Home_v1 home2 = new Home_v1("villa", "Mountain View", 1500);
        Home_v1 home3 = new Home_v1("brownstone", "New York", 1200);
        Home_v1 home4 = new Home_v1("condo", "Boston", 4000);

        List<Home_v1> homesList = new ArrayList<>();

        homesList.add(home1);
        homesList.add(home2);
        homesList.add(home3);
        homesList.add(home4);

        System.out.println("**Before sorting: \n" + homesList);

        Collections.sort(homesList, new Comparator<Home_v1>() {
            @Override
            public int compare(Home_v1 o1, Home_v1 o2) {
                return o1.getAreaSqFt() - o2.getAreaSqFt();
            }
        });

        System.out.println("**After sorting: \n" + homesList);


        class LocalRunnable implements Runnable {

            public void run() {
                System.out.format("Current thread name: %s priority: %d\n",
                        Thread.currentThread().getName(),  Thread.currentThread().getPriority());
            }
        }

        Thread thread = new Thread(new LocalRunnable());
        thread.start();

        System.out.format("Current thread name: %s priority: %d\n",
                Thread.currentThread().getName(),  Thread.currentThread().getPriority());

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.format("Current thread name: %s priority: %d\n",
                        Thread.currentThread().getName(),  Thread.currentThread().getPriority());
            }
        });
        thread1.start();

        System.out.format("Current thread name: %s priority: %d\n",
                Thread.currentThread().getName(),  Thread.currentThread().getPriority());
    }

}
