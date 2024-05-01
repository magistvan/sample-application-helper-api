package io.github.magistvan.sampleapplicationhelper.api.invoker;

import io.github.magistvan.sampleapplicationhelper.api.resource.SampleApplicationHelperResource;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "sample-application-helper",
        url = "${spring.cloud.openfeign.client.config.sample-application-helper.url}")
public interface SampleApplicationHelperInvoker extends SampleApplicationHelperResource {
}
