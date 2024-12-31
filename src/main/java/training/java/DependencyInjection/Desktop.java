package training.java.DependencyInjection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //this annotation let this class be manage by the DI
@Scope("prototype") //create a class each time (not singleton that is the default scope)
public class Desktop implements IComputer{

    private static final Logger logger = LoggerFactory.getLogger(Desktop.class);

    @Override
    public void ShowPrice() {
        logger.info("Desktop showing price: {}", this.getPrice());
    }

    private int price=100;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
