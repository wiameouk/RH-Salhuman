package com.example.rhsalhuman.repositories;

import java.util.Optional;

import com.example.rhsalhuman.entities.RefreshToken;
import com.example.rhsalhuman.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;



@Repository
public interface RefreshTokenRepository extends JpaRepository<RefreshToken , Long>
{

    Optional<RefreshToken> findByToken(String token);
    @Modifying
    int deleteByUser(User user);
    Optional<RefreshToken> findByUserId(Long userId);
}
