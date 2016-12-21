package com.project.loc.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by thomas.croguennec on 21/12/16.
 */
@Configuration
@EnableWebMvc
@Import( {SecurityConfig.class})
public class AppConfig {
}
