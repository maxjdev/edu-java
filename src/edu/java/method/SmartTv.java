package src.edu.java.method;
import java.util.Scanner;

public class SmartTv {
    boolean on;
    int channel = 1;
    int volume = 25;
    Scanner scanner = new Scanner(System.in);

    public void setOn() {
        on = true;
        System.out.println("TV On ? = " + on);
    }
    public void setOff() {
        on = false;
        System.out.println("TV On ? = " + on);
    }
    public void channelUp () {
        channel++;
        System.out.println("Current channel " + channel);
    }
    public void channelDown () {
        channel--;
        System.out.println("Current channel " + channel);
    }

    public void setChannel() {
        System.out.println("Enter the channel number: ");
        int channel = scanner.nextInt();
        System.out.println("Current channel " + channel);
    }

    public void volumeUp () {
        volume++;
        System.out.println("Current volume " + volume);
    }
    public void volumeDown () {
        volume--;
        System.out.println("Current volume " + volume);
    }

}
