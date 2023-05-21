package src.edu.java.methods.mtd2;
public class Message {
    public static void message (int hour) {
        switch (hour) {
            case 5, 6, 7, 8, 9, 10, 11 -> goodMorning();
            case 12, 13, 14, 15, 16, 17, 18 -> goodAfternoon();
            case 19, 20, 21, 22, 23, 0, 1, 2, 3, 4 -> goodNight();
            default -> System.out.println("Invalid hour !");
        }
    }
    public static void goodMorning () {
        System.out.println("Good Morning !");

    }
    public static void goodAfternoon () {
        System.out.println("Good Afternoon !");
    }
    public static void goodNight () {
        System.out.println("Good Night !");
    }
}
