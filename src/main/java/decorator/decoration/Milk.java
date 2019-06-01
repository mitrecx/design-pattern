package decorator.decoration;

import java.math.BigDecimal;

/**
 * 装饰者<br>
 * 牛奶--咖啡调料
 * 
 * @author cx
 * @time 2019年6月1日 下午2:07:36
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal("4").add(beverage.cost());
    }

}
