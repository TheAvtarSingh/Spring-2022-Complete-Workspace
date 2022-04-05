package org.ncu.spring_workout_annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.ncu.spring_workout_annotation")
@PropertySource("classpath:field.properties")
public class SportsConfigClass {

}
