package com.cr.journal.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Getter
@Setter
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)

public class usert {
    private Integer idUser;
    private String firstname;
    private String lastname;
    private String username;
    private String phoneNumber;
    private String email;
    private String password;
}
