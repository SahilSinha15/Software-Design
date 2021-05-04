public class marshmallowManAlien extends Alien{

    public marshmallowManAlien(int health, String name) {
        super(health, name);

    }
    @Override
    public String getAlienType() {
        return "Marshmallow Alien";
    }
    @Override
    public int getAlienDamage() {
        return 1;
    }
}
