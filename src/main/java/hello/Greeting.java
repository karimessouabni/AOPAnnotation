package hello;

import lombok.*;
import myAnnotation.ContactNumberConstraint;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Greeting {

    @NotNull
    private long id;

    @Size(min=2, max=2)
    private String content;

    @ContactNumberConstraint
    private String phone;



    @Pattern(regexp = "karim*",
            message = "L'article ne commence pas par le mot 'karim'")
    private String article;


}
