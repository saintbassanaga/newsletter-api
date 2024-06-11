package tech.saintbassanaga.newletterapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import tech.saintbassanaga.newletterapi.model.User;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID>{
}