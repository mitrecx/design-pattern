package factory.simple;

/**
 * 芝士披萨
 * 
 * @author cx
 * @time 2019年6月2日 下午1:53:03
 */
public class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "芝士披萨";
        dough = "薄面";
        sauce = "意大利海员酱";
        toppings.add("高级干奶酪");
    }
}
