package pbojavaspring.spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import pbojavaspring.spring.core.factory.PaymentGatewayClientFactoryBean;

@Configuration
@Import({
        PaymentGatewayClientFactoryBean.class
})
public class FactoryConfiguration {
}
