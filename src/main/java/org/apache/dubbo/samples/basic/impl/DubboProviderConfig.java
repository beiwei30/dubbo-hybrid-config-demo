package org.apache.dubbo.samples.basic.impl;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableDubbo(scanBasePackages = "org.apache.dubbo.samples.impl")
@PropertySource("classpath:/spring/dubbo-provider.properties")
public class DubboProviderConfig {
}
