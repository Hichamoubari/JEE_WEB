package ma.enset.jee_web.repositories;

import ma.enset.jee_web.entites.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PatientRepository extends JpaRepository<Patient, Long> {

   /* @Query("select p from Patient p where p.nom like :x and p.score<:y")
    Page<Patient> findByNomContains(@Param("x") String kw , @Param("y") int scoreMin, Pageable pageable);
*/
    Page<Patient> findByNomContainsAndScoreGreaterThan(String kw,int score,Pageable pageable);





}
