package com.pack.sample1.appuser;


import java.util.Collection;
import java.util.Collections;

import javax.annotation.processing.Generated;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Entity
 
public class AppUser implements UserDetails{

    @Id
    @SequenceGenerator(
        name= "student_sequence",
        sequenceName= "student_sequence",
        allocationSize=1
    )
    @GeneratedValue(
        strategy= GenerationType.SEQUENCE,
        generator= "student_sequence"
    )
    private Long id;
    private String name;
    private String username;
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private AppUserRole appUserRole;
    private Boolean locked;
    private Boolean enabled;



    public AppUser(AppUserRole appUserRole, String email, Boolean enabled, Boolean locked, String name, String password, String username) {
        this.appUserRole = appUserRole;
        this.email = email;
        this.enabled = enabled;
        this.locked = locked;
        this.name = name;
        this.password = password;
        this.username = username;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(appUserRole.name());
        
        return Collections.singletonList(authority);
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return !locked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }



    



    

}