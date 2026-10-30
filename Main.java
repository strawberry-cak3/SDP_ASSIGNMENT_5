interface RouteStrategy {
    double calculateRoute(double distance);
    String getModeName();
}

// Concrete Strategy 1
class DrivingStrategy implements RouteStrategy {
    @Override
    public double calculateRoute(double distance) {
        // Average speed: 60 km/h, plus traffic factor
        return (distance / 60.0) * 60; // returns estimated time in minutes
    }

    @Override
    public String getModeName() {
        return "Driving";
    }
}

// Concrete Strategy 2
class WalkingStrategy implements RouteStrategy {
    @Override
    public double calculateRoute(double distance) {
        // Average walking speed: 5 km/h
        return (distance / 5.0) * 60;
    }

    @Override
    public String getModeName() {
        return "Walking";
    }
}

// Concrete Strategy 3
class BicyclingStrategy implements RouteStrategy {
    @Override
    public double calculateRoute(double distance) {
        // Average cycling speed: 15 km/h
        return (distance / 15.0) * 60;
    }

    @Override
    public String getModeName() {
        return "Bicycling";
    }
}

// Context
class Navigator {
    private RouteStrategy strategy;

    public Navigator(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public double executeRoutePlanning(double distance) {
        return strategy.calculateRoute(distance);
    }

    public String getCurrentMode() {
        return strategy.getModeName();
    }
}

// Client
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
