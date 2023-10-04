package io.github.magistvan.sampleapplicationhelper.api.resource;

import org.springframework.web.bind.annotation.GetMapping;

public interface SampleApplicationHelperResource {
    @GetMapping("/api/helper")
    String getText();

    @GetMapping("/api/helper/cached")
    String getCached();
}
