package factory.method;

/**
 * @author cx
 * @time 2019年6月2日 下午3:11:36
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyeleCheesePizza();
        } else if (type.equals("veggie")) {
            // 为了演示简单, 其他的披萨类型, 就不写了, 都是一样的.
            return null;
        }
        return null;
    }

}
