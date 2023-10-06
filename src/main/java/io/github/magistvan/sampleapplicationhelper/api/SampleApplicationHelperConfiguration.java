package io.github.magistvan.sampleapplicationhelper.api;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "io.github.magistvan.sampleapplicationhelper.api.invoker")
public class SampleApplicationHelperConfiguration {
}
