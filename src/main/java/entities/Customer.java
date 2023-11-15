package entities;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
public class Customer {

    private String title;

    private String firstName;

    private String lastName;

    private String street;

    private String house;

    private String postalCode;

    private String city;
}
