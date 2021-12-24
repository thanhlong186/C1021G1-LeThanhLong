package ss19_string_and_regex.bai_tap2;

public class MyPhoneTest {
    private static MyPhone myPhone;
    public static final String[] validPhone = new String[] { "84-0978489648", "84-0934567822"};
    public static final String[] invalidPhone = new String[] { "a4-0722222222", "84-0809678543"};

    public static void main (String[] args) {
        myPhone = new MyPhone();
        for (String phone : validPhone) {
            boolean isvalid = myPhone.validate(phone);
            System.out.println("Phone is " + phone + ","  + " is valid " + isvalid);
        }
        for(String phone : invalidPhone) {
            boolean isvalid = myPhone.validate(phone);
            System.out.println("Phone is " + phone + "," + " is valid " + isvalid);
        }
    }
}
