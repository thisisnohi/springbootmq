package nohi;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class IbmmqApplication {

    public static void main(String[] args) {
        SpringApplication.run(IbmmqApplication.class, args);
    }
}
