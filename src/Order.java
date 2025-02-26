import java.util.*;

// Order Class
enum OrderStatus { PENDING, SHIPPED, DELIVERED; }

// Constructer
class Order {
    private UUID orderId;
    private String customerName;
    private UUID productId;
    private int quantity;
    private OrderStatus orderStatus;

    public Order(String customerName, UUID productId, int quantity) {
        this.orderId = UUID.randomUUID();
        this.customerName = customerName;
        this.productId = productId;
        this.quantity = quantity;
        this.orderStatus = OrderStatus.PENDING;
    }

    public UUID getOrderId() { return orderId; }
    public OrderStatus getOrderStatus() { return orderStatus; }
    public void setOrderStatus(OrderStatus status) { this.orderStatus = status; }
}
