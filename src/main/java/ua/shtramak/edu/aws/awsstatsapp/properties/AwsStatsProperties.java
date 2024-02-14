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

    public String getAmiId() {
        return amiId;
    }

    public void setAmiId(String amiId) {
        this.amiId = amiId;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public String getServiceDomain() {
        return serviceDomain;
    }

    public void setServiceDomain(String serviceDomain) {
        this.serviceDomain = serviceDomain;
    }
}
