package com.mycompany.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;

@Configuration
@MapperScan("com.mycompany.persistence")
public class DataConfig {

    @Bean
    public DataSource dataSource() {
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriverClass(org.h2.Driver.class);
        dataSource.setUsername("sa");
//        url para manter os dados =  jdbc:h2:tcp://localhost/~/test
        dataSource.setUrl("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE");
        dataSource.setPassword("");

        // Criar Tabelas para teste
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        System.out.println("===========CRIANDO TABELAS===============");
        jdbcTemplate.execute("DROP TABLE DESENV_CIDADES IF EXISTS");
        jdbcTemplate.execute("CREATE TABLE DESENV_CIDADES(CD_CIDADE SERIAL, NOME_CIDADE VARCHAR(255), UF_CIDADE VARCHAR(4))");
        jdbcTemplate.update("INSERT INTO DESENV_CIDADES(CD_CIDADE, NOME_CIDADE, UF_CIDADE) VALUES (?,?,?)", "1", "RIO DE JANEIRO", "RJ");
        jdbcTemplate.update("INSERT INTO DESENV_CIDADES(CD_CIDADE, NOME_CIDADE, UF_CIDADE) VALUES (?,?,?)", "2", "SÃO PAULO", "SP");

        return dataSource;
    }

    @Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setTypeAliasesPackage("com.mycompany.domain");
        return sessionFactory;
    }
}
