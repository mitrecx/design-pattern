package factory.method;

/**
 * @author cx
 * @time 2019年6月2日 下午2:57:24
 */
public class NYStyeleCheesePizza extends Pizza {
    public NYStyeleCheesePizza() {
        name = "纽约 风格 芝士披萨";
        dough = "薄面";
        sauce = "番茄酱";
        toppings.add("意大利高级干奶酪");
    }
}
