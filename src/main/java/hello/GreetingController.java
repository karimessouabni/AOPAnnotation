package hello;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

import myAnnotation.ExecutionTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validation;
import javax.validation.Validator;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();


    @Autowired
    Service service;


    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) throws InterruptedException {


        Greeting g = Greeting.builder()
                .content("toto").build();

        Validator validator = Validation
                .buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<Greeting>> violations = validator
                .validate(g);

        System.out.println("Nombre de violations : " + violations.size());


        service.serve();
        // if(true) throw new RuntimeException("run time mssg Test");
        return g;
    }


    @PostMapping("/greeting")
    public String submitSomthingToHere(@Valid Greeting greeting, BindingResult result, Model m) {
        System.out.println("Nombre de violations : " + result.getErrorCount());
        if (result.hasErrors()) {
            String errorMsg = "Erreurs lors de validation des information du formulaire =";
            Set<String> tabError = new HashSet<>();
            result.getAllErrors().forEach(e -> {
                        tabError.add(e.getDefaultMessage());
                    }
            );
            throw new RuntimeException(tabError.toString());
        }


        return "toto is persisted";

    }


}
