package Ass_1;

public class House {
    private String walls;
    private String roof;
    private String floor;
    private boolean hasGarage;
    private boolean hasGarden;

    // private constructor (только Builder может создавать объект)
    private House(HouseBuilder builder) {
        this.walls = builder.walls;
        this.roof = builder.roof;
        this.floor = builder.floor;
        this.hasGarage = builder.hasGarage;
        this.hasGarden = builder.hasGarden;
    }

    @Override
    public String toString() {
        return "House with " + walls + " walls, " + roof + " roof, "
                + floor + " floor, Garage: " + hasGarage + ", Garden: " + hasGarden;
    }

    // Static Builder
    public static class HouseBuilder {
        private String walls;
        private String roof;
        private String floor;
        private boolean hasGarage;
        private boolean hasGarden;

        public HouseBuilder setWalls(String walls) {
            this.walls = walls;
            return this;
        }

        public HouseBuilder setRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public HouseBuilder setFloor(String floor) {
            this.floor = floor;
            return this;
        }

        public HouseBuilder setGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public HouseBuilder setGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}
