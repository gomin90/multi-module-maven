package com.beginsecure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableKafka
public class BatchApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(BatchApplication.class, args);
    }
}
