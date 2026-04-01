package co.com.bancolombia.config;

import co.com.bancolombia.secretsmanager.api.GenericManager;
import co.com.bancolombia.secretsmanager.connector.AWSSecretManagerConnector;
import co.com.bancolombia.secretsmanager.api.exceptions.SecretException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecretsConfig {

  @Bean
  public Object getSecret(@Value("${aws.secretName}") String secretName, GenericManager connector) throws SecretException {
    return connector.getSecret(secretName, Object.class); // TODO Change the Object class for Secret model
  }

  @Bean
  public GenericManager getSecretManager(@Value("${aws.region}") String region) {
    return new AWSSecretManagerConnector(region);
  }
}
