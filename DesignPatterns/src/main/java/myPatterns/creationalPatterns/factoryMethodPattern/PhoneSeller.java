package myPatterns.creationalPatterns.factoryMethodPattern;

public class PhoneSeller {
    public static void main(String[] args) {
        Phone s8 = PhoneFactory.getPhone("s8", "3000mah", 4, 8);
        System.out.println(s8);
        Phone note8 = PhoneFactory.getPhone("note8", "300mah", 5, 9);
        System.out.println(note8);
    }
}
