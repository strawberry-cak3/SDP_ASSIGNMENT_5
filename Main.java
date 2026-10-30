
public class Main {
    public static void main(String[] args) {
        double distance = 12.5;

        Navigator navigator = new Navigator(new DrivingStrategy());
        System.out.println("Mode: " + navigator.getCurrentMode());
        System.out.println("Estimated Time: " + navigator.executeRoutePlanning(distance) + " minutes");

        navigator.setStrategy(new BicyclingStrategy());
        System.out.println("Mode: " + navigator.getCurrentMode());
        System.out.println("Estimated Time: " + navigator.executeRoutePlanning(distance) + " minutes");

        navigator.setStrategy(new WalkingStrategy());
        System.out.println("Mode: " + navigator.getCurrentMode());
        System.out.println("Estimated Time: " + navigator.executeRoutePlanning(distance) + " minutes");
    }
}