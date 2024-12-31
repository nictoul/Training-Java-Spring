package training.java.DependencyInjection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Developer {

    private static final Logger logger = LoggerFactory.getLogger(Desktop.class);

    @Autowired //Tell that it should be injected by DI
    @Qualifier("desktop") //specify which implementation of IComputer to use because there is 2 implementations
    private IComputer computer;

    public void DoSomething() {
        logger.info("Developper Do something");
        computer.ShowPrice();
    }

}
