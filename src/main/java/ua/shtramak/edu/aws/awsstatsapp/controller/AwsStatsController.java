package ua.shtramak.edu.aws.awsstatsapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.shtramak.edu.aws.awsstatsapp.properties.AwsStatsProperties;

@RestController
@RequestMapping("/stats")
public class AwsStatsController {
    private final AwsStatsProperties awsStatsProperties;

    public AwsStatsController(AwsStatsProperties awsStatsProperties) {
        this.awsStatsProperties = awsStatsProperties;
    }

    @GetMapping
    public ResponseEntity<AwsStatsProperties> getAwsStats() {
        return ResponseEntity.ok(awsStatsProperties);
    }
}
