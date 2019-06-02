package factory.method;

/**
 * 披萨店: 拥有一个 "工厂方法", 让子类 去实现/重写 这个 "工厂方法". <br>
 * 
 * @author cx
 * @time 2019年6月2日 下午2:55:03
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /**
     * 工厂方法, 由子类决定 实例化 的对象是什么<br>
     * 
     * @param type
     *            披萨类型: 芝士披萨/素食披萨
     * @return
     */
    protected abstract Pizza createPizza(String type);
}
