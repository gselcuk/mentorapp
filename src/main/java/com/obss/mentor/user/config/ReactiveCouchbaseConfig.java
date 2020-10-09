package com.obss.mentor.user.config;

import java.time.Duration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableReactiveCouchbaseRepositories;
import com.couchbase.client.core.env.IoConfig;
import com.couchbase.client.java.env.ClusterEnvironment;

/**
 * Couchbase properties.
 * 
 * @author Goktug Selcuk
 *
 */
@Configuration
@EnableReactiveCouchbaseRepositories("com.obss.mentor.repository")
@PropertySource("classpath:couchbase.properties")
public class ReactiveCouchbaseConfig extends AbstractCouchbaseConfiguration {

  @Value("${spring.couchbase.bootstrap-hosts}")
  private String bootstrapHosts;
  @Value("${spring.couchbase.user.name}")
  private String userName;
  @Value("${spring.couchbase.user.password}")
  private String userPassword;
  @Value("${spring.couchbase.bucket.name}")
  private String bucketName;
  CouchbaseProperties p;

  @Override
  public String getConnectionString() {
    return bootstrapHosts;
  }

  @Override
  public String getUserName() {
    return userName;
  }

  @Override
  public String getPassword() {
    return userPassword;
  }

  @Override
  public String getBucketName() {
    return bucketName;
  }

  @Override
  protected void configureEnvironment(final ClusterEnvironment.Builder builder) {
    builder.ioConfig(IoConfig.idleHttpConnectionTimeout(Duration.ofSeconds(4)))
        .thresholdRequestTracerConfig().queryThreshold(Duration.ofSeconds(12)).build();
  }

}
