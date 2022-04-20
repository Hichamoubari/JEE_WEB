package ma.enset.jee_web;

import ma.enset.jee_web.entites.Patient;
import ma.enset.jee_web.repositories.PatientRepository;
import ma.enset.jee_web.sec.service.SecurityService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Date;

@SpringBootApplication
public class JeeWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(JeeWebApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder(){

		return new BCryptPasswordEncoder();
	}

	//@Bean
	CommandLineRunner commandLineRunner(PatientRepository patientRepository){
		return args -> {
            patientRepository.save(new Patient(null,"Hicham",new Date(), true,180));
			patientRepository.save(new Patient(null,"Ghita",new Date(), false,188));
			patientRepository.save(new Patient(null,"Assia",new Date(), true,120));
			patientRepository.save(new Patient(null,"Salma",new Date(), false,110));

			patientRepository.findAll().forEach(patient -> {
				System.out.println(patient.getNom());
			});

		};
	}
	//@Bean
	CommandLineRunner saveUsers(SecurityService securityService){
		return args -> {
			securityService.saveNewUser("hicham","1234","1234");
			securityService.saveNewUser("karima","1234","1234");
			securityService.saveNewUser("anas","1234","1234");

			securityService.saveNewRole("USER","");
			securityService.saveNewRole("ADMIN","");

			securityService.addRoleToUser("hicham","USER");
			securityService.addRoleToUser("hicham","ADMIN");
			securityService.addRoleToUser("karima","USER");
			securityService.addRoleToUser("anas","USER");
		};
	}


}
