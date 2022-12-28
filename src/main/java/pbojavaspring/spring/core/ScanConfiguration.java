package pbojavaspring.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "pbojavaspring.spring.core.configuration"
})
public class ScanConfiguration {
}
