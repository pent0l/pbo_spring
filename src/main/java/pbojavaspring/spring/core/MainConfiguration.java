package pbojavaspring.spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import pbojavaspring.spring.core.configuration.BarConfiguration;
import pbojavaspring.spring.core.configuration.FooConfiguration;

@Configuration
@Import({
        FooConfiguration.class,
        BarConfiguration.class
})
public class MainConfiguration {
}
