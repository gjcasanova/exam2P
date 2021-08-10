package ec.edu.espe.exam.business.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
public class AgencyId implements Serializable {
    @NonNull
    @Column(name = "cod_agency", nullable = false, length = 8, updatable = false)
    private String codAgency;

    @NonNull
    @Column(name = "cod_business", nullable = false, length = 8, updatable = false)
    private String codBusiness;

}
