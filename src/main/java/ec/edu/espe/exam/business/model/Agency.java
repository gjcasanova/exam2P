package ec.edu.espe.exam.business.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;

@Data
@Entity
@Table(name = "test_agency")
@NoArgsConstructor
public class Agency {
    @EmbeddedId
    @NonNull
    private AgencyId id;

    @Column(name = "name", nullable = false, length = 150)
    private String name;

    @MapsId("codAgency")
    @Column(name = "cod_agency", nullable = false, length = 8, updatable = false)
    private String codAgency;

    @MapsId("codBusiness")
    @Column(name = "cod_business", nullable = false, length = 8, updatable = false)
    private String codBusiness;

}
