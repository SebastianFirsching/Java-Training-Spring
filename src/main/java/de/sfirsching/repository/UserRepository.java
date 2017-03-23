package de.sfirsching.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import de.sfirsching.entity.User;

import java.util.List;

/**
 * Created by sfirsching on 23.02.2017.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByNameAndSurname(String name, String surname);
}
