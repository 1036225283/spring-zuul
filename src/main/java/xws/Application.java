package xws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 程序启动入口
 * Created by root on 2018/7/16.
 */


//下面的注解激活Eureka中的DiscoveryClient实现自动化配置
@EnableDiscoveryClient
@SpringBootApplication
@EnableZuulProxy
public class Application {


    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }


}
