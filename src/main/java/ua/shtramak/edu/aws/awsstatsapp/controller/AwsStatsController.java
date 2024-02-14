package ua.shtramak.edu.aws.awsstatsapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.shtramak.edu.aws.awsstatsapp.controller.dto.AwsStatsDto;
import ua.shtramak.edu.aws.awsstatsapp.properties.AwsStatsProperties;

@RestController
@RequestMapping("/stats")
public class AwsStatsController {
    private final AwsStatsProperties awsStatsProperties;

    public AwsStatsController(AwsStatsProperties awsStatsProperties) {
        this.awsStatsProperties = awsStatsProperties;
        System.out.println("================");
        System.out.println(awsStatsProperties.getAmiId());
        System.out.println(awsStatsProperties.getHostname());
        System.out.println(awsStatsProperties.getServiceDomain());
        System.out.println(awsStatsProperties.getInstanceType());
        System.out.println("================");
        
    }

    @GetMapping
    public ResponseEntity<AwsStatsDto> getAwsStats() {
        return ResponseEntity.ok(AwsStatsDto.from(awsStatsProperties));
    }
}
