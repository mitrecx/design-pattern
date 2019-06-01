package decorator.decoration;

import java.math.BigDecimal;

/**
 * 饮料类， 装饰者模式中的 装饰者和被装饰者 共同的超类
 * 
 * @author cx
 * @time 2019年6月1日 下午1:48:41
 */
public abstract class Beverage {
    protected String description = "Unknown Beverage.";

    public String getDescription() {
        return description;
    }

    public abstract BigDecimal cost();
}
