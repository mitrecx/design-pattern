package factory.simple;

/**
 * 简单工厂: 有一个制作披萨的方法.<br>
 * 可以理解为 简单工厂 "有一个" 披萨.<br>
 * 
 * @author cx
 * @time 2019年6月2日 下午1:20:57
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
