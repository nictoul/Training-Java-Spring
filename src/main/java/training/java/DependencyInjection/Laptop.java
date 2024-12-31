package training.java.DependencyInjection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Laptop implements IComputer{

    private static final Logger logger = LoggerFactory.getLogger(Laptop.class);

    @Override
    public void ShowPrice() {
        logger.info("Laptop Do something");
    }
}
