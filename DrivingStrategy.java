
class DrivingStrategy implements RouteStrategy {
    @Override
    public double calculateRoute(double distance) {
        return (distance / 60.0) * 60;
    }

    @Override
    public String getModeName() {
        return "Driving";
    }
}
