/*package com.iflytek.config;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.transport.TransportAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
@Configuration
@PropertySource(value = "classpath:config/elasticsearch.properties")
@EnableElasticsearchRepositories(basePackages = "com.iflytek.dao.es")
public class ElasticSearchConfig {

    @Autowired
    private Environment environment;

    @Bean
    public Client client() {
        TransportClient client = new TransportClient();
        System.out.println("端口是："+environment.getProperty("elasticsearch.port"));
        TransportAddress address = new InetSocketTransportAddress(environment.getProperty("elasticsearch.host"), Integer.parseInt(environment.getProperty("elasticsearch.port")));
        client.addTransportAddress(address);
        return client;
    }

    @Bean
    public ElasticsearchOperations elasticsearchTemplate() {
        return new ElasticsearchTemplate(client());
    }
}
*/