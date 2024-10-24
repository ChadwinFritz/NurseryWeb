package za.ac.cput.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String mobileNumber;
    private LocalDate dateOfBirth;

}
