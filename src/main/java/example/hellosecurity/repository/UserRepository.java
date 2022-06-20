package example.hellosecurity.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import example.hellosecurity.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByNome(String nome);
}
