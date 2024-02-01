package basicauthentication.example.dto;

import basicauthentication.example.model.Role;
import lombok.Builder;

import java.util.Set;


@Builder
public record CreateUserRequest (
        String name,
        String username,
        String password,
        String salary,
        String town,
        String city,

        Set<Role> authorities
){}
