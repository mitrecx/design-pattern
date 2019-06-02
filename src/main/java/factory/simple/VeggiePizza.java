package factory.simple;

/**
 * 素食披萨
 * @author cx
 * @time 2019年6月2日 下午2:13:39
 */
public class VeggiePizza extends Pizza{
    public VeggiePizza() {
        name = "素食披萨";
        dough = "薄面";
        sauce = "花生酱";
        toppings.add("洋葱");
    }
}
