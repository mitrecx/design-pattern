package factory.simple;

/**
 * 披萨店: 有一个 "简单工厂", 利用简单工厂制作披萨, 而不是自己制作.<br>
 * 
 * @author cx
 * @time 2019年6月2日 下午2:24:13
 */
public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
