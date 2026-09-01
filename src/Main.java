enum OrderStatus{
    PENDING,PROCESSING,SHIPPED,DELIVERED,CANCELLED;
}

public class Main {
    static void main() {
        OrderStatus O1 = OrderStatus.PENDING;
        System.out.println(O1);

        OrderStatus O2 = OrderStatus.SHIPPED;

                switch(O2){
                    case PENDING:
                        System.out.println("the order is pending..");
                        break;

                    case SHIPPED:
                        System.out.println("the order is shipped");
                        break;

                    case PROCESSING:
                        System.out.println("the order is being processed..");
                        break;

                    case DELIVERED:
                        System.out.println("the order is already delivered...");
                        break;

                    case CANCELLED:
                        System.out.println("the order was cancelled...");
                        break;

                    default:
                        System.out.println("please try again.....");
                }


    }
}