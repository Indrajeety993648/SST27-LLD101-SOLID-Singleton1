import com.example.orders.*;
import java.util.List;

public class TryIt {
    public static void main(String[] args) {
        OrderLine l1 = new OrderLine("A", 1, 200);
        OrderLine l2 = new OrderLine("B", 3, 100);
        Order o = new Order.Builder()
                .id("o2")
                .customerEmail("a@b.com")
                .discountPercent(10)
                .addLine(l1)
                .addLine(l2)
                .build();
        System.out.println("Total after discount: " + o.totalAfterDiscount());
        // l1.setQuantity(999); // Not allowed: OrderLine should be immutable for
        // correctness
        System.out.println("=> In the solution, totals remain stable due to immutability.");
    }
}
