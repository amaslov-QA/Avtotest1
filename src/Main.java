public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10000;
        int miles = service.calculate(price);
        System.out.println(miles);
        int priceAra = 500;
        int milesAra = service.calculate(priceAra);
        System.out.println(milesAra);
        int priceTur = 600000;
        int milesTur = service.calculate(priceTur);
        System.out.println(milesTur);

    }
}
