package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
public class Application{

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }

      @Bean
      public TextData data() { return new TextData(); }

//    @Bean
//    public LexicalizedParser parser() {
//        return loadModel("edu/stanford/nlp/models/lexparser/englishPCFG.ser.gz");
//    }

}
