public class Main {
    public static void main(String[] args) {
        Ship ship = new Ship();
        ship.fillship();
        for (int i = 0; i <Ship.pirates.size() ; i++) {
            System.out.println(Ship.pirates.get(i).rank);
        }
        Ship ship1 =new Ship();
        ship1.fillship();
        ship.getInfo();
        ship1.getInfo();
        ship.pirates.get(0).drinkSomeRum();
        ship.battle(ship1);
        ship.getInfo();
        ship1.getInfo();

    }
}
