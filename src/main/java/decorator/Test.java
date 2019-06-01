package decorator;

import decorator.decoration.Beverage;
import decorator.decoration.Espresso;
import decorator.decoration.Latte;
import decorator.decoration.Milk;
import decorator.decoration.Mocha;

/**
 * @author cx
 * @time 2019年6月1日 下午3:21:27
 */
public class Test {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        espresso = new Mocha(espresso);
        System.out.println("描述：" + espresso.getDescription());
        System.out.println("价格： " + espresso.cost());

        Beverage latte = new Latte();
        latte = new Mocha(latte);
        latte = new Mocha(latte);
        latte = new Milk(latte);
        System.out.println("描述：" + latte.getDescription());
        System.out.println("价格： " + latte.cost());
    }
}
