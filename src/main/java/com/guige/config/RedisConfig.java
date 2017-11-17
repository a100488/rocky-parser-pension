/*
package com.guige.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
public class RedisConfig {

    @Value("${spring.redis.database}")
    private Integer database;

    @Value("${spring.redis.host}")
    private String host;

    @Value("${spring.redis.password}")
    private String password;

    @Value("${spring.redis.port}")
    private Integer port;

    @Value("${spring.redis.timeout}")
    private Integer timeout;

    @Value(value = "${spring.redis.expire:300}")
    private Integer expiration;

    @Value("${spring.redis.pool.maxactive}")
    private int maxActive;

    @Value("${spring.redis.pool.minidle}")
    private int minIdle;

    @Value("${spring.redis.pool.maxidle}")
    private int maxIdle;


    @Bean
    public JedisPoolConfig jedisPoolConfig(){
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        poolConfig.setMaxIdle(this.maxIdle);
        poolConfig.setMinIdle(this.minIdle);
        poolConfig.setTestOnCreate(true);
        poolConfig.setTestOnBorrow(true);
        poolConfig.setTestOnReturn(true);
        poolConfig.setTestWhileIdle(true);
        return poolConfig;
    }

    @Bean
    public JedisConnectionFactory jedisConnectionFactory(){
        JedisPoolConfig config = jedisPoolConfig();
        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory(config);
        jedisConnectionFactory.setDatabase(this.database);
        jedisConnectionFactory.setHostName(this.host);
        jedisConnectionFactory.setPassword(this.password);
        jedisConnectionFactory.setPort(this.port);
        jedisConnectionFactory.setTimeout(this.timeout);
        return jedisConnectionFactory;
    }

}
*/
