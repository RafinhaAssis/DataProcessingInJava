package github.rafael.configurations;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class OrderConfiguration {

    @Value("${git.datasource.url}")
    private String url;
    @Value("${git.datasource.username}")
    private String username;
    @Value("${git.datasource.password}")
    private String password;
    @Value("${git.datasource.driver}")
    private String driver;


    @Primary
    @Bean("conexao")
    public DataSource hikaryDataSource(){
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(url);
        config.setUsername(username);
        config.setPassword(password);
        config.setDriverClassName(driver);

        config.setMaximumPoolSize(10);//Maximo de conexões
        config.setMinimumIdle(1);// Tamanho inicial do pool
        config.setPoolName("library-pool-db");
        config.setMaxLifetime(600000); // Depois de 10 minutos a conexão morre
        config.setConnectionTimeout(100000); // Tempo para o receber uma resposta do banco anter de dar exceção de timeout
        config.setConnectionTestQuery("Select 1");

        return new HikariDataSource(config);
    }
}
