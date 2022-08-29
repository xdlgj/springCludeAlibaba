# Ribbon
## 修改默认负载均衡策略
全局配置：调用其他微服务，一律使用指定的负载均衡算法<br>
注意：不能将配置类写在@SpringbootAppliaction注解的@ComponentScan扫描到的地方，否则自定义的配置类就会被所有的RibbonClients共享，不建议这个使用，推荐使用yml方式。

局部配置：调用指定微服务提供的服务时，使用对应的负载均衡算法，需要修改application.yml文件
```yml
stock-service:
  ribbon:
    NFLoadBalancerRulerClassName: com.alibaba.cloud.nacos.ribbon.NacosRule
```
配置类方式：
```java
@SpringBootApplication()
@RibbonClients(value = {
        @RibbonClient(name = "stock-service", configuration = RibbonRandomRuleConfig.class)
})
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
}
```