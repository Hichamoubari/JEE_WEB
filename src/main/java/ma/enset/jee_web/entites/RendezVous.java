package ma.enset.jee_web.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class RendezVous {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private StatusRDV status;
    @ManyToOne
    private Patient patient;
    @ManyToOne
    private Medcin medcin;
    @OneToOne(mappedBy = "rendezVous")
    private Consultation consultation;

}
