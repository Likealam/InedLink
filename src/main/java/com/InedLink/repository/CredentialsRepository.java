package com.InedLink.repository;

import com.InedLink.dto.CredentialsDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CredentialsRepository extends JpaRepository<CredentialsDto,Integer> {
    CredentialsDto getCredentialsDtoByUsername(String username);
}
