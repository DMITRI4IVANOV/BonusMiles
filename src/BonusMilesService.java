public class BonusMilesService {
    public int calculate(int amount, boolean isRegistered) {
        int cost = isRegistered ? 20 : amount;
        int miles;
        miles = amount / cost;
        return miles;
    }
}
