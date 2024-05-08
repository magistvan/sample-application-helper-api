package io.github.magistvan.sampleapplicationhelper.api.invoker.local;

import io.github.magistvan.sampleapplicationhelper.api.resource.SampleApplicationHelperResource;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Profile;

@Profile("local")
@FeignClient(name = "sample-application-helper", url = "localhost:8081")
public interface LocalSampleApplicationHelperInvoker extends SampleApplicationHelperResource {
}

