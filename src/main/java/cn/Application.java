package cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        //程序入口类
        SpringApplication.run(Application.class);
        System.out.println("Springboot启动");
    }
}
