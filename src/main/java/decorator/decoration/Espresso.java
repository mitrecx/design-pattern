package decorator.decoration;

import java.math.BigDecimal;

/**
 * 浓缩咖啡
 * 
 * @author cx
 * @time 2019年6月1日 下午1:58:01
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal("13.5");
    }

}
