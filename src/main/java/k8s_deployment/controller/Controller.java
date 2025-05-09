package k8s_deployment.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Value("${database.username}")
    private String username;

    @GetMapping("/api/username")
    public String getUsername() {
        return "application.yaml 또는 configMap에서 가지고옴" + username;
    }
}
