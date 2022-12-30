package by.koolbasov.videoperimetrproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class VideoPerimetrProjectApplication {

    public static void main(String[] args) {

        SpringApplication.run(VideoPerimetrProjectApplication.class, args);
    }

}
