package fi.kapsi.kosmik.devmail.web;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * The web application class also serves as spring boot starting point by using
 * spring boot's EnableAutoConfiguration annotation and providing the main
 * method.
 */
@Component
@EnableAutoConfiguration
@ComponentScan(basePackages = {"fi.kapsi.kosmik.devmail"})
public class DevMailApplication extends WebApplication {
    private final static Logger logger = LoggerFactory.getLogger(DevMailApplication.class);

    @Autowired
    private ApplicationContext applicationContext;

    /**
     * spring boot main method to build context
     */
    public static void main(String[] args) {
        SpringApplication.run(DevMailApplication.class, args);
    }

    @Override
    public Class<? extends Page> getHomePage() {
        return StartPage.class;
    }

    @Override
    protected void init() {
        super.init();
        getComponentInstantiationListeners().add(new SpringComponentInjector(this, applicationContext));
        logger.info("initialized wicket application.");
    }
}
