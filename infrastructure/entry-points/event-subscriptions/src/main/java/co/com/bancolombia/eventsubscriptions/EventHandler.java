package co.com.bancolombia.eventsubscriptions;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.reactivecommons.async.api.HandlerRegistry;
import org.reactivecommons.async.impl.config.annotations.EnableMessageListeners;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

import static co.com.bancolombia.commons.enums.EventTypeEnum.ACCOUNT_RETRIEVED_BASIC;
import static org.reactivecommons.async.api.HandlerRegistry.register;

@Log4j2
@Configuration
@EnableMessageListeners
@RequiredArgsConstructor
public class EventHandler {

    private final ObjectMapper objectMapper;

    @Bean
    public HandlerRegistry notificationEvents() {
        return register()
                .listenNotificationEvent(ACCOUNT_RETRIEVED_BASIC.getName(), eventResponse -> {
                    toJsonLog(eventResponse);
                    return Mono.empty();
                }, EventData.class);
    }

    private <T> void toJsonLog(T object){
        try {
            log.info(objectMapper.writeValueAsString(object));
        }catch (Exception e){
            log.error("NO SERIALIZO OBJETO A JSON ", e);
        }
    }

}