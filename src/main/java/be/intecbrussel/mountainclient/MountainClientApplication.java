package be.intecbrussel.mountainclient;

import be.intecbrussel.model.Mountain;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@SpringBootApplication(scanBasePackages = "be")
public class MountainClientApplication {

    public static void main(String[] args) {
        //SpringApplication.run(MountainClientApplication.class, args);


        RestTemplate restTemplate = new RestTemplate();
//        List<Mountain> mountains = restTemplate.getForObject("http://localhost:8080/mountain", List.class);
//        System.out.println(mountains);
//        sortMountains();

        //
        ResponseEntity<List<Mountain>> mountains = restTemplate.exchange("http://localhost:8080/mountain",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Mountain>>() {
                });
        List<Mountain> mountainsList = mountains.getBody();
        System.out.println("-------------------------");
        System.out.println("before " + mountainsList);
        Collections.sort(mountainsList);
        System.out.println("-------------------------");
        System.out.println("after " + mountainsList);
        System.out.println("-------------------------");
        mountainsList.forEach(System.out::println);


    }
}

