public class ogreAlien extends Alien{

    public ogreAlien(int health, String name) {
        super(health, name);
    }

    @Override
    public String getAlienType() {
        return "Ogre Alien";
    }
    @Override
    public int getAlienDamage() {
        return 6;
    }
}
