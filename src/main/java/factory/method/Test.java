package factory.method;

/**
 * @author cx
 * @time 2019年6月2日 下午3:10:30
 */
public class Test {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("完成订单: " + pizza.getName() + "\n");

        PizzaStore chicagoStore = new ChicagoPizzaStore();
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("完成订单: " + pizza.getName());
    }
}
