public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int secondsInADay = 24*60*60;

        int remainingSeconds = secondsInADay - (currentSeconds + (currentMinutes*60) + (currentHours*60*60));

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented bt the variables

        System.out.println(remainingSeconds);
    }
}
