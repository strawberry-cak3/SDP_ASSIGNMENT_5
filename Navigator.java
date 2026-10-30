
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
