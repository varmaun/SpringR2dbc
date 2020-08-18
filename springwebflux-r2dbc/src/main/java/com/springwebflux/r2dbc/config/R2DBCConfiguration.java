/*
 * package com.springwebflux.r2dbc.config;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration; import
 * org.springframework.data.r2dbc.connectionfactory.R2dbcTransactionManager;
 * import
 * org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
 * import org.springframework.transaction.ReactiveTransactionManager;
 * 
 * import io.r2dbc.spi.ConnectionFactory;
 * 
 * 
 * @Configuration
 * 
 * @EnableR2dbcRepositories public class R2DBCConfiguration extends
 * AbstractR2dbcConfiguration {
 * 
 * @Override
 * 
 * @Bean public ConnectionFactory connectionFactory() { return
 * H2ConnectionFactory.inMemory("testdb"); }
 * 
 * @Bean ReactiveTransactionManager transactionManager(ConnectionFactory
 * connectionFactory) { return new R2dbcTransactionManager(connectionFactory); }
 * }
 */