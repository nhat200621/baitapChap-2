public class Main {
    public static void main(String[] args) {
        char ch1 = 'A';
        char ch2 = 'a';
        char ch3 = '1';
        char ch4 = ' ';
        char ch5 = '\u00C6';
        System.out.println("isLetter('A'): " + Character.isLetter(ch1));
        System.out.println("isDigit('1'): " + Character.isDigit(ch3));
        System.out.println("isWhitespace(' '): " + Character.isWhitespace(ch4));
        System.out.println("isUpperCase('A'): " + Character.isUpperCase(ch1));
        System.out.println("isLowerCase('a'): " + Character.isLowerCase(ch2));
        System.out.println("toUpperCase('a'): " + Character.toUpperCase(ch2));
        System.out.println("toLowerCase('A'): " + Character.toLowerCase(ch1));
        Character charObj = new Character(ch1);
        System.out.println("charValue(): " + charObj.charValue());
        System.out.println("isDefined('\\u00C6'): " + Character.isDefined(ch5));
        System.out.println("isAlphabetic(65): " + Character.isAlphabetic(65));
    }
}