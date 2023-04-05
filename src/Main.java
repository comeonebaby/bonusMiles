public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();

        int ticketPrice = 2345;

        int bonusMiles = service.calculate(ticketPrice);

        System.out.println("Начислено " + bonusMiles + " миль.");

    }

}