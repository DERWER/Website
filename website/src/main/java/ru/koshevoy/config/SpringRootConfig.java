package ru.koshevoy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan({ "ru.koshevoy.service" })
public class SpringRootConfig {
}