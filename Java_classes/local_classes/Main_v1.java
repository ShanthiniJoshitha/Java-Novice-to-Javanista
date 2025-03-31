package local_classes;

public class Main_v1 {

    public static void main(String[] args) {

        Customer_v1 jason = new Customer_v1(1234, "Jason", "212-345-1235, jason@gmail.com");
        jason.validateCustomer();

        System.out.println(jason);

        // Run

        Customer_v1 mona = new Customer_v1(2344, "Mona", "23345456567, mona@somemail.com");
        mona.validateCustomer();

        System.out.println(mona);

        // Run

        Customer_v1 lucy = new Customer_v1(2344, "Lucy", "425-341-0987, lucy@somemail");
        lucy.validateCustomer();

        System.out.println(lucy);

        // Run
    }
}
