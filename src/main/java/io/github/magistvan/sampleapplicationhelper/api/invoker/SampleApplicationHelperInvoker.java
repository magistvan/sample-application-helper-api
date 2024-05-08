package io.github.magistvan.sampleapplicationhelper.api.invoker;

import io.github.magistvan.sampleapplicationhelper.api.resource.SampleApplicationHelperResource;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "sample-application-helper", url = "${sample-application-helper.url}")
public interface SampleApplicationHelperInvoker extends SampleApplicationHelperResource {
}
