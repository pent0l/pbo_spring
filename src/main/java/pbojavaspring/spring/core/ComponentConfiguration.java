package pbojavaspring.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import pbojavaspring.spring.core.data.MultiFoo;

@Configuration
@ComponentScan(basePackages = {
        "pbojavaspring.spring.core.repository",
        "pbojavaspring.spring.core.service",
        "pbojavaspring.spring.core.configuration"
})

@Import(MultiFoo.class)
public class ComponentConfiguration {
}
