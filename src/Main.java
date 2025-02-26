import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product laptop = new Product("Laptop", 1200.0, 20, 5);
        Product smartphone = new Product("Smartphone", 800.0, 10, 3);


        System.out.print("Enter average daily sales for Laptop: ");
        int laptopSales = scanner.nextInt();
        System.out.print("Enter average daily sales for Smartphone: ");
        int smartphoneSales = scanner.nextInt();

        System.out.println();
        laptop.displayProductInfo();
        smartphone.displayProductInfo();
        System.out.println();
        StockPredictor.predictStock(laptop, laptopSales);
        StockPredictor.predictStock(smartphone, smartphoneSales);

        // Simulate Order Processing
        OrderManager orderManager = new OrderManager();
        Order order1 = new Order("Shadia", laptop.getProductId(), 2);
        Order order2 = new Order("Fawaz", smartphone.getProductId(), 1);

        orderManager.processOrder(order1);
        orderManager.processOrder(order2);

        scanner.close();

    }
}