package ma.enset.jee_web.sec.repositories;

import ma.enset.jee_web.sec.entites.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser,String> {

    AppUser findByUsername(String username);

}
