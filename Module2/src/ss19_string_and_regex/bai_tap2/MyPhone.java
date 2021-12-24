package ss19_string_and_regex.bai_tap2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyPhone {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String PHONE_REGEX = "^[0-9]{2}-(09)[0-9]{8}$";
    public MyPhone(){
    }

    public boolean validate(String regex) {
        pattern = Pattern.compile(PHONE_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
