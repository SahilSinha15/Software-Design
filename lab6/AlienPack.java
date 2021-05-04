public class AlienPack {
    private Alien[] aliens;
    public AlienPack (int numAliens) {
        aliens = new Alien[numAliens];
    }
    public void addAlien(Alien newAlien, int index) {
        aliens[index] = newAlien;
    }
    public void getAliens() {

        for(Alien a: aliens){
            System.out.println(a);
        }
    }
    public int calculateDamage() {
        int damage = 0;
        for(Alien a: aliens){
            if(a.getAlienType().equals("Snake Alien")){
                damage+=a.getAlienDamage();
            }
            else if(a.getAlienType().equals("Ogre Alien")){
                damage+=a.getAlienDamage();
            }
            else if(a.getAlienType().equals("Marshmallow Alien")){
                damage+=a.getAlienDamage();
            }
        }
        return damage;
    }

    public static void main(String[] args) {
        AlienPack a = new AlienPack(5);
        a.addAlien(new snakeAlien(30,"Snake1"),0);
        a.addAlien(new snakeAlien(35,"Snake2"),1);
        a.addAlien(new ogreAlien(90,"Ogre1"),2);
        a.addAlien(new ogreAlien(85,"Ogre2"),3);
        a.addAlien(new marshmallowManAlien(15,"Marshy1"),4);
        a.getAliens();
        System.out.println(a.calculateDamage());

    }


}
