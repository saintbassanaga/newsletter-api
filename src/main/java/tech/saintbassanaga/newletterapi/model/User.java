package tech.saintbassanaga.newletterapi.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

@Entity
@Table(name = "users")
public class User extends AbstractEntity {
    private String name;
    private String username;
    private String surname;
    @Embedded
    private Address Address;

}