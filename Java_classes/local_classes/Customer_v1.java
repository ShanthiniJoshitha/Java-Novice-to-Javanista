package local_classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer_v1 {

    private final long id;
    private final String name;
    private final String contactInfo;

    private String validPhoneNumber;
    private String validEmailAddress;

    public Customer_v1(long id, String name, String contactInfo) {
        this.id = id;
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public void validateCustomer() {

        class ContactValidator {

            private final String contactInfo;

            ContactValidator(String contactInfo) {
                this.contactInfo = contactInfo;
            }

            String getPhoneNumber() {
                Pattern pattern = Pattern.compile("^[1-9]\\d{2}-\\d{3}-\\d{4}");
                Matcher phoneMatcher = pattern.matcher(contactInfo);

                if (phoneMatcher.find()) {
                    return phoneMatcher.group();
                }

                return null;
            }

            String getEmailAddress() {

                Pattern pattern = Pattern.compile("[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}");
                Matcher emailMatcher = pattern.matcher(contactInfo);

                if (emailMatcher.find()) {
                    return emailMatcher.group();
                }

                return null;
            }

        }

        ContactValidator contactValidator = new ContactValidator(contactInfo);

        this.validPhoneNumber = contactValidator.getPhoneNumber();
        this.validEmailAddress = contactValidator.getEmailAddress();
    }

    @Override
    public String toString() {
        return String.format("ID: %d, name: %s, phone: %s, email: %s",
                id, name, validPhoneNumber, validEmailAddress);
    }
}
