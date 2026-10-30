
class BicyclingStrategy implements RouteStrategy {
    @Override
    public double calculateRoute(double distance) {
        return (distance / 15.0) * 60;
    }

    @Override
    public String getModeName() {
        return "Bicycling";
    }
}
