package ru.folder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.folder.models.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAllByFirstName(String firstName);

    Optional<User> findOneByLogin(String login);
}
