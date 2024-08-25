public class StatementSwitchCase {
    
    private static final String UPPERCASE = "uppercase";
    private static final String LOWERCASE = "lowercase";
    private static final String DIGIT = "digit";

    public static void main(String[] args) {
        
        char karakter = '9';

        String regexUppercase = "[A-Z]";
        String regexLowercase = "[a-z]";
        String regexDigit = "[\\d]";

        String category = "";

        if (String.valueOf(karakter).matches(regexUppercase)) {
            category = UPPERCASE;
        } else if (String.valueOf(karakter).matches(regexLowercase)) {
            category = LOWERCASE;
        } else if (String.valueOf(karakter).matches(regexDigit)) {
            category = DIGIT;
        }

        switch (category) {
            case UPPERCASE:
                System.out.println("contain uppercase");
                break;
            case LOWERCASE:
                System.out.println("contain lowercase");
                break;
            case DIGIT:
                System.out.println("contain digit");
                break;
            default:
                System.out.println("char: "+ karakter);
        }

    }

}
