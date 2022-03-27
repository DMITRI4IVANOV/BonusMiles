public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int miles = service.calculate(7509,true);
        System.out.println("Ваши бонусные мили: " + miles );

        int milesUnisRegistered = service.calculate(7509,false);
        System.out.println("Ваши бонусные мили: " + milesUnisRegistered);
    }
}
