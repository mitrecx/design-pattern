package factory.simple;

/**
 * @author cx
 * @time 2019年6月2日 下午2:22:24
 */
public class Test {
    public static void main(String[] args) {
        // 实例化工厂
        SimplePizzaFactory factory = new SimplePizzaFactory();
        // PizzaStore 的 对象会利用 工厂生产披萨
        PizzaStore store = new PizzaStore(factory);

        Pizza cheesePizza = store.orderPizza("cheese");
        System.out.println("完成订单: " + cheesePizza.getName());
        // ---准备 芝士披萨 开始---
        // 面: 薄面
        // 酱料: 意大利海员酱
        // 撒点 高级干奶酪
        // ---准备 芝士披萨 结束---
        // 烘烤 25 分钟.
        // 沿着直径切成弧形块.
        // 装到 披萨 盒子里.
        // 完成订单: 芝士披萨
        
        Pizza veggiePizza = store.orderPizza("veggie");
        System.out.println("完成订单: " + veggiePizza.getName());
        // ---准备 素食披萨 开始---
        // 面: 薄面
        // 酱料: 花生酱
        // 撒点 洋葱
        // ---准备 素食披萨 结束---
        // 烘烤 25 分钟.
        // 沿着直径切成弧形块.
        // 装到 披萨 盒子里.
        // 完成订单: 素食披萨
    }
}
