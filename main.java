package Ass_1;

public class Main {
    public static void main(String[] args) {
        House woodenHouse = new House.HouseBuilder()
                .setWalls("wooden")
                .setRoof("tile")
                .setFloor("wood")
                .setGarage(true)
                .setGarden(false)
                .build();

        House stoneHouse = new House.HouseBuilder()
                .setWalls("stone")
                .setRoof("concrete")
                .setFloor("marble")
                .setGarage(false)
                .setGarden(true)
                .build();

        System.out.println(woodenHouse);
        System.out.println(stoneHouse);
    }
}
