
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

class OrderManager {
    private static final Logger logger = Logger.getLogger(OrderManager.class.getName());
    private final ExecutorService executor = Executors.newFixedThreadPool(2);

    public void processOrder(Order order) {
        executor.submit(() -> {
            try {

                Thread.sleep(2000);
                order.setOrderStatus(OrderStatus.SHIPPED);
                logger.info("Order " + order.getOrderId() + " shipped.");


                Thread.sleep(2000);
                order.setOrderStatus(OrderStatus.DELIVERED);
                logger.info("Order " + order.getOrderId() + " delivered.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
    }

    public void shutdown() {
        executor.shutdown();
    }
    public void processOrder() {
        System.out.println("Processing order - Modified by feature-branch1 and feature-branch2");
    }
}
