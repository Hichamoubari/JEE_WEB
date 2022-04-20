package ma.enset.jee_web.sec.repositories;

import ma.enset.jee_web.sec.entites.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole,Long> {

    AppRole findByRoleName(String roleName);

}
