package be.intecbrussel.mountainclient;

import be.intecbrussel.model.Mountain;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootApplication(scanBasePackages = "be")
public class MountainClientApplication {

    public static void main(String[] args) {
        //SpringApplication.run(MountainClientApplication.class, args);

        RestTemplate restTemplate = new RestTemplate();
        List<Mountain> mountains = restTemplate.getForObject("http://localhost:8080/mountain", List.class);
        System.out.println(mountains);
    }

}

