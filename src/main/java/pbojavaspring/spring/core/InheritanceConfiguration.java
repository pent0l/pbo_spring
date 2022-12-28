package pbojavaspring.spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import pbojavaspring.spring.core.service.MerchantService;
import pbojavaspring.spring.core.service.MerchantServiceImpl;

@Configuration
@Import(MerchantServiceImpl.class)
public class InheritanceConfiguration {
}
