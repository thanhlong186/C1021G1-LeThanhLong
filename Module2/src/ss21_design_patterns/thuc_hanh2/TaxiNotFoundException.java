package ss21_design_patterns.thuc_hanh2;

public class TaxiNotFoundException extends RuntimeException{
    public TaxiNotFoundException(String message) {
        System.out.println(message);
    }
}
