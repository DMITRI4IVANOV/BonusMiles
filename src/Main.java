public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int miles = service.calculate(7509);
        System.out.println("Ваши бонусные мили: " + miles);
    }
}
