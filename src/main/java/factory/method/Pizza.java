package factory.method;

import java.util.ArrayList;

/**
 * @author cx
 * @time 2019年6月2日 下午1:22:45
 */
public abstract class Pizza {
    String name;
    // 面
    String dough;
    // 酱料
    String sauce;
    // 一套佐料
    ArrayList<String> toppings = new ArrayList<String>();

    void prepare() {
        System.out.println("---准备 " + name + " 开始---");
        System.out.println("面: " + dough);
        System.out.println("酱料: " + sauce);
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("撒点 " + toppings.get(i));
        }
        System.out.println("---准备 " + name + " 结束---");
    }

    void bake() {
        System.out.println("烘烤 25 分钟.");
    }

    void cut() {
        System.out.println("沿着直径切成弧形块.");
    }

    void box() {
        System.out.println("装到 披萨 盒子里.");
    }

    public String getName() {
        return name;
    }
}
