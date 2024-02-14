package ua.shtramak.edu.aws.awsstatsapp.controller.dto;

import ua.shtramak.edu.aws.awsstatsapp.properties.AwsStatsProperties;

public class AwsStatsDto {
    private String amiId;

    private String hostname;

    private String instanceType;

    private String serviceDomain;

    public static AwsStatsDto from(AwsStatsProperties awsStatsProperties) {
        AwsStatsDto result = new AwsStatsDto();
        result.setAmiId(awsStatsProperties.getAmiId());
        result.setHostname(awsStatsProperties.getHostname());
        result.setServiceDomain(awsStatsProperties.getServiceDomain());
        result.setInstanceType(awsStatsProperties.getInstanceType());
        return result;
    }

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
