import ru.netology.stats.StatsService;

public class Main {

    public static void main(String[] args) {
        StatsService service=new StatsService();

        long sales[] = {1, 2, 3, 2, 5, 1};

        System.out.println(service.sumSales(sales));
        System.out.println(service.averageSales(sales));
        System.out.println(service.minMonth(sales));
        System.out.println(service.maxMonth(sales));
        System.out.println(service.belowAverage(sales));
        System.out.println(service.aboveAverage(sales));

    }
}
