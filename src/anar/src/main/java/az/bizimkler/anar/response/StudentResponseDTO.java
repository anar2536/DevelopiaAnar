package anar.src.main.java.az.bizimkler.anar.response;


import lombok.Data;

@Data
public class StudentResponseDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}