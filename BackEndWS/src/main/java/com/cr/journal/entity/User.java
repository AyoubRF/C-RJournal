package com.cr.journal.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Entity
@Table(name = "JOURNAL_USER")
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class User implements UserDetails {

    @Id
    @Column(name = "ID_USER")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUser;

    @Column(name = "FIRST_NAME")
    private String firstname;

    @Column(name = "LAST_NAME")
    private String lastname;

//    @NotNull
    @Size(min = 4, max = 50)
    @Column(length = 50, unique = true, nullable = false, name = "USER_NAME")
    private String username;

    @Column(name = "PASSWORD")
    @NotEmpty
//    @NotNull
    @Size(min = 6)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

//    @Column(name = "CREATION_DATE")
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
//    private Date creationDate = new Date();

//    @ManyToOne
//    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
//    private User manager;
//
//    @OneToMany(mappedBy = "manager")
//    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
//    private List<User> managedUsers;

    @Email
    @Size(min = 5, max = 100)
    @Column(length = 100, unique = true, name = "EMAIL")
    private String email;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

//    @OneToMany(mappedBy = "journaliste")
//    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
//    private List<Article> articles;

//    @OneToMany(mappedBy = "journaliste")
//    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
//    private List<Article> visiteur;

//    @OneToOne
//    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
//    private Image image;

    @ElementCollection(fetch = FetchType.EAGER)
    @Builder.Default
    private List<String> roles = new ArrayList<>();

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.roles.stream().map(SimpleGrantedAuthority::new).collect(toList());
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    //write Role here manager-journaliste visiteur (not use extends class )
}
