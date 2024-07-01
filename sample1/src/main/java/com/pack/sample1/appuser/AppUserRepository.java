package com.pack.sample1.appuser;

import java.util.Optional;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;




@Repository
@Transactional(readOnly = true)
public interface AppUserRepository{

    Optional<AppUser> findByEmail(String email);

    
}