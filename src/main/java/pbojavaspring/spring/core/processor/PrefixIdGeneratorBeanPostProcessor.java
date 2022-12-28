package pbojavaspring.spring.core.processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import pbojavaspring.spring.core.aware.IdAware;

import java.util.UUID;

@Slf4j
@Component
public class PrefixIdGeneratorBeanPostProcessor implements BeanPostProcessor, Ordered {

    @Override
    public int getOrder(){
        return 2;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("Prefix Id Generator for Bean{}", beanName);
        if(bean instanceof IdAware){
            log.info("Prefix Set Id Generator for Bean{}", beanName);
            IdAware idAware = (IdAware) bean;
            idAware.setId("PBO-"+idAware.getId());
        }
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }

    //    @Override
//    public Object postProcessorAfterInitialization(Object bean, String beanName) throws BeansException{
//        log.info("Id Generator for Bean{}", beanName);
//        if(bean instanceof IdAware){
//            log.info("Set Id Generator for Bean{}", beanName);
//            IdAware idAware = (IdAware) bean;
//            idAware.setId(UUID.randomUUID().toString());
//        }
//        return bean;
//    }



}
