package ua.shtramak.edu.aws.awsstatsapp.properties;

import io.awspring.cloud.context.config.annotation.EnableContextInstanceData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableContextInstanceData
public class AwsStatsProperties {
    @Value("${ami-id}")
    private String amiId;

    @Value("${hostname}")
    private String hostname;

    @Value("${instance-type}")
    private String instanceType;

    @Value("${services/domain}")
    private String serviceDomain;
}
