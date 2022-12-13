package main;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Parrot {

    private String name;

    @PostConstruct
    private void init() {
        this.name = "Kiki";
    }

    @PreDestroy
    public void destroy() {
        System.out.println(this.name + " is being destroyed!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                '}';
    }
}
