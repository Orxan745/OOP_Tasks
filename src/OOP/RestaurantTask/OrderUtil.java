package OOP.RestaurantTask;

public class OrderUtil {

    public static Order[] orderList = new Order[10];

    public static int ordersCount = 0;

    public static void addNewOrder(Order order) {
        int percentage = (ordersCount / orderList.length) * 100;
        if (percentage >= 80) {
            Order[] orderList1 = new Order[orderList.length*2];
            for (int i = 0; i < ordersCount; i++) {
                orderList1[i] = orderList[i];
            }
            orderList = orderList1;
        }
        orderList[ordersCount] = order;
        ordersCount++;
    }

    public static void removeOrder(String orderName) {
        for (int i = ordersCount; i > 0; i--) {
            if (orderList[i].getOrderName().equals(orderName)) {
                orderList[i] = null;
                for (int j = 0; j < ordersCount; i++) {
                    Order order = orderList[i];
                    orderList[i+j] = orderList[i+j+1];
                    orderList[i+j+1] = order;
                }
                break;
            }
        }
    }

    public static void printOrderList(){
        System.out.println("---------------------------------------");
        double total = 0;
        for (int i = 0; i < ordersCount; i++) {
            if (orderList[i] != null) {
                System.out.println(orderList[i].getOrderName()+" "+orderList[i].getOrderPrice());
                total = total + orderList[i].getOrderPrice();
            }
        }
        System.out.println("Total: "+total);
        System.out.println("---------------------------------------");
    }
}
