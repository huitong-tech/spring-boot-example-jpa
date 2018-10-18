package com.pivaiot.starter.project.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "fileupload")
public class FileUploadConfig {
    /**
     * Folder for storing upload files
     */
    @Getter @Setter
    private String path = "./files";

    @Getter @Setter
    private String tmpPath = "./files/tmp";

    @Getter @Setter
    private Long maxFileSize = 10 * 1024L * 1024L; // 10MB
}
