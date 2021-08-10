package ec.edu.espe.exam.business.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
public class UserAgencyId implements Serializable {
    @NonNull
    @Column(name = "cod_user", nullable = false, length = 30)
    private String codUser;

    @NonNull
    @JoinColumns({
            @JoinColumn(name = "cod_agency", nullable = false, updatable = false),
            @JoinColumn(name = "cod_business", nullable = false, updatable = false)
    })
    private AgencyId agencyId;

    /*@NonNull
    @Column(name = "cod_agency", nullable = false, length = 8)
    private String codAgency;

    @NonNull
    @Column(name = "cod_business", nullable = false, length = 8)
    private String codBusiness;*/

}
