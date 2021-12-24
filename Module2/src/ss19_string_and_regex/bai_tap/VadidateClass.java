package ss19_string_and_regex.bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VadidateClass {
    private static Pattern pattern;
    private Matcher matcher;

    public static final String CLASS_REGEX = "^[CAP]\\d{4}[GHIKLM]$";

    public VadidateClass() {
//        pattern = Pattern.compile(CLASS_REGEX);
    }

    public boolean validate(String regex) {
        pattern = Pattern.compile(CLASS_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
