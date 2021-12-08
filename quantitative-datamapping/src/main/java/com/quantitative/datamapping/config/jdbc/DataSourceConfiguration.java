package com.quantitative.datamapping.config.jdbc;


import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
public class DataSourceConfiguration {

    /**
     * @return
     */
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean(name = "dataSource")
    @Primary
    public DataSource createDataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    /**
     * @param dataSource
     * @return
     */
    @Bean("transactionManager")
    public PlatformTransactionManager createTransactionManager(@Qualifier("dataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

}
