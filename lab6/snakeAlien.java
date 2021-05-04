public class snakeAlien extends Alien {

    public snakeAlien(int health, String name) {
        super(health, name);

    }

    @Override
    public String getAlienType() {
        return "Snake Alien";
    }

    @Override
    public int getAlienDamage() {
        return 10;
    }
}
