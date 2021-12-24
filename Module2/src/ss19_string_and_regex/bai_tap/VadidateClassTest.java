package ss19_string_and_regex.bai_tap;




public class VadidateClassTest {
    private static VadidateClass vadidateClass;

    public static final String[] validClass = new String[] { "C0210G", "A0504G", "P1806M"};
    public static final String[] invalidClass = new String[] {"M0318G", "P0412C", "I1904J"};

    public static void main(String[] args) {
        vadidateClass = new VadidateClass();
       for (String valid : validClass){
           boolean isclass = vadidateClass.validate(valid);
            System.out.println("class is "+ valid + "is valid" + isclass);
        }
        for (String valid : invalidClass ) {
            boolean isclass = vadidateClass.validate(valid);
            System.out.println("class is "+ valid + "is valid" + isclass);
        }

    }
}
