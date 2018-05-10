public class FleetOfThings {
    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        Thing milk = new Thing("Get milk");
        Thing obstacles = new Thing("Remove the obstacles");
        Thing eat = new Thing("Eat lunch");
        Thing stand = new Thing("Stand up straight");
        fleet.add(milk);
        fleet.add(obstacles);
        fleet.add(eat);
        fleet.add(stand);
        stand.complete();
        eat.complete();

        System.out.println(fleet);
    }
}
