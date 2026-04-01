package co.com.bancolombia.kms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.kms.KmsAsyncClient;
import software.amazon.awssdk.services.kms.KmsAsyncClientBuilder;
import co.com.bancolombia.kms.config.model.KmsConnectionProperties;

import java.net.URI;

@Configuration
public class KmsConfig {

    @Profile({"dev", "cer", "pdn"})
    @Bean
    public KmsAsyncClient kmsAsyncClient(KmsConnectionProperties kmsProperties) {
        return getBuilder(kmsProperties).build();
    }

    @Profile("local")
    @Bean
    public KmsAsyncClient localKmsAsyncClient(KmsConnectionProperties kmsProperties) {
        return getBuilder(kmsProperties)
                .endpointOverride(URI.create(kmsProperties.getEndpoint()))
                .build();
    }

    private KmsAsyncClientBuilder getBuilder(KmsConnectionProperties kmsProperties) {
        return KmsAsyncClient.builder().region(Region.of(kmsProperties.region()));
    }

}
