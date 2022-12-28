package pbojavaspring.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pbojavaspring.spring.core.data.Connection;
import pbojavaspring.spring.core.data.Server;

@Configuration
public class LifeCycleConfiguration {

    @Bean
    public Connection connection(){
        return new Connection();
    }

//    @Bean(initMethod = "start", destroyMethod = "stop")
    @Bean
    public Server server(){
        return new Server();
    }
}
