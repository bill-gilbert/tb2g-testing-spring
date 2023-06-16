package org.springframework.samples.petclinic.sfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseConfig {
    @Bean
    HearingInterpreter hearingInterpriter(WordProducer wordProducer) {
        return new HearingInterpreter(wordProducer);
    }
}
