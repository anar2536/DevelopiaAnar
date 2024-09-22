package anar.src.main.java.az.bizimkler.anar.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserAddRequestDTO {
    private String username;
    private String password;
}
