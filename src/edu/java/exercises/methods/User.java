package src.edu.java.exercises.methods;

public class User {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("Default values");
        System.out.println("----------------------------------------");
        System.out.println("TV on ? " + smartTv.on);
        System.out.println("Current channel " + smartTv.channel);
        System.out.println("Volume " + smartTv.volume);
        System.out.println("----------------------------------------");

        System.out.println("Set on");
        smartTv.setOn();
        System.out.println("----------------------------------------");

        System.out.println("Set off");
        smartTv.setOff();
        System.out.println("----------------------------------------");

        System.out.println("Channel +");
        smartTv.channelUp();
        System.out.println("----------------------------------------");

        System.out.println("Channel -");
        smartTv.channelDown();
        System.out.println("----------------------------------------");

        System.out.println("Search Channel");
        smartTv.setChannel();
        System.out.println("----------------------------------------");

        System.out.println("Volume up");
        smartTv.volumeUp();
        System.out.println("----------------------------------------");

        System.out.println("Volume down");
        smartTv.volumeDown();
        System.out.println("----------------------------------------");

    }
}
