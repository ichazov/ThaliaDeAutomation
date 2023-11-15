package entities;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
public class CustomerAccount {

    private String email;

    private String password;
}
