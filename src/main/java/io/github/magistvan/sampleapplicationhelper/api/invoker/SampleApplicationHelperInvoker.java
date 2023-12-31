package io.github.magistvan.sampleapplicationhelper.api.invoker;

import io.github.magistvan.sampleapplicationhelper.api.resource.SampleApplicationHelperResource;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "sample-application-helper", url = "http://localhost:8080")
public interface SampleApplicationHelperInvoker extends SampleApplicationHelperResource {
}
