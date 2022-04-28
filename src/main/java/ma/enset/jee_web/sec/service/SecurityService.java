package ma.enset.jee_web.sec.service;

import ma.enset.jee_web.sec.entites.AppRole;
import ma.enset.jee_web.sec.entites.AppUser;


public interface SecurityService {

    AppUser saveNewUser(String username, String password,String rePassword);
    AppRole saveNewRole(String roleName, String description);
    void addRoleToUser(String username, String roleName);
    void removeRoleFromUser(String username, String roleName);
    AppUser loadUserByUserName(String username);



}
