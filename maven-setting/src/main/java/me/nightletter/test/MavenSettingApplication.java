package me.nightletter.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@SpringBootApplication
public class MavenSettingApplication {

    public static void main(String[] args) {
        SpringApplication.run(MavenSettingApplication.class, args);
    }
}
