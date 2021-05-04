public class GameCarDemo {
    public static void main(String[] args) {
        GameCar car1 = new GameCar("MyBuddy", "Red", 19);
        GameCar car2 = new GameCar();
        car1.moveForward(5);
        car1.moveBackward(2);
        car1.setColor("Black");
        System.out.println(car1);
        car2.getCarInfo();
        car2.moveForward(7);
        car2.moveForward(3);
        System.out.println(car2);
        car1.race(car2);
        car1.moveForward(10);
        car1.race(car2);
        car1.setCar("BlueJay", "Blue", 30);
        car1.race(car2);

        System.out.println("Same cars? " + car1.equals(car2));
    }
}