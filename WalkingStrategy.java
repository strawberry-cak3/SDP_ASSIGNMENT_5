// Файл: WalkingStrategy.java
class WalkingStrategy implements RouteStrategy {
    @Override
    public double calculateRoute(double distance) {
        return (distance / 5.0) * 60;
    }

    @Override
    public String getModeName() {
        return "Walking";
    }
}
