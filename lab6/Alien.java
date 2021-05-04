public abstract class Alien {
    public static final int SNAKE_ALIEN = 0;
    public static final int OGRE_ALIEN = 1;
    public static final int MARSHMALLOW_MAN_ALIEN = 2;

    public int health; // 0=dead, 100=full strength
    public String name;

    public Alien(int health, String name) {
        this.health = health;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.getAlienType()+" {" +
                "health=" + health +
                ", name='" + name + '\'' +
                '}';
    }

    public String getAlienType(){
     return " ";
    }

    public abstract int getAlienDamage();


}

