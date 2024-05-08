package io.github.magistvan.sampleapplicationhelper.api.invoker;

import io.github.magistvan.sampleapplicationhelper.api.resource.SampleApplicationHelperResource;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Profile;

@Profile("!local")
@FeignClient(name = "sample-application-helper", url = "sample-application-helper")
public interface SampleApplicationHelperInvoker extends SampleApplicationHelperResource {
}
