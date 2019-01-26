package com.github.lyd.common.autoconfigure;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liuyadu
 */
@Configuration
public  class MqAutoConfiguration {
    public static final String QUEUE_SCAN_API_RESOURCE = "openCloud.scan.api.resource";
    public static final String QUEUE_ACCESS_LOGS = "openCloud.access.logs";

    /**
     * direct模式，直接根据队列名称投递消息
     *
     * @return
     */
    @Bean
    public Queue apiResourceQueue() {
        return new Queue(QUEUE_SCAN_API_RESOURCE);
    }

    @Bean
    public Queue accessLogsQueue() {
        return new Queue(QUEUE_ACCESS_LOGS);
    }

}
