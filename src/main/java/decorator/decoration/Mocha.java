package decorator.decoration;

import java.math.BigDecimal;

/**
 * 装饰者<br>
 * 摩卡--咖啡调料
 * 
 * @author cx
 * @time 2019年6月1日 下午2:03:11
 */
public class Mocha extends CondimentDecorator {
    // 实例变量： 记录饮料
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public BigDecimal cost() {
        return beverage.cost().add(new BigDecimal("2"));
    }

}
