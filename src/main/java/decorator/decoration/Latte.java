package decorator.decoration;

import java.math.BigDecimal;

/**
 * 拿铁咖啡
 * 
 * @author cx
 * @time 2019年6月1日 下午2:00:31
 */
public class Latte extends Beverage{
    public Latte() {
        description="Latte";
    }
    
    public BigDecimal cost() {
        return new BigDecimal("20");
    }
}
