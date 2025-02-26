class StockPredictor {
    public static void predictStock(Product product, int dailySalesAvg) {

        int daysUntilStockOut = product.getStockLevel() / dailySalesAvg;
        String suggestion;

        if (daysUntilStockOut <= product.getReorderThreshold()) {
            suggestion = "High: Restock immediately!";
        } else if (daysUntilStockOut <= 5) {
            suggestion = "Moderate: Consider restocking soon.";
        } else {
            suggestion = "Low: No urgent restocking needed.";
        }

        System.out.println("Stock Prediction for " + product.getName() + ":");
        System.out.println("Days until stock out: " + daysUntilStockOut);
        System.out.println("Restock Suggestion: " + suggestion);
    }
}
