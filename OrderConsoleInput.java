package srp;
import java.util.Scanner;

public class OrderConsoleInput {

    public void readFromConsole(Order order) {
        Scanner in = new Scanner(System.in);
        System.out.print("Имя покупателя: ");
        order.setClientName(in.nextLine());

        System.out.print("Продукт: ");
        order.setProduct(in.nextLine());

        System.out.print("Количесво: ");
        order.setQnt(Integer.parseInt(in.nextLine()));

        System.out.print("Общая стоимость: ");
        order.setPrice(Integer.parseInt(in.nextLine()));
    }
}

