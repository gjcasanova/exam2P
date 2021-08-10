package ec.edu.espe.exam.business.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "test_user_agency")
@NoArgsConstructor
@Data
public class UserAgency implements Serializable {

    @NonNull
    @EmbeddedId
    private UserAgencyId id;

    @MapsId("codUser")
    @ManyToOne(optional = false)
    @JoinColumn(name = "cod_user", nullable = false, updatable = false)
    private User user;

    @MapsId("agencyId")
    @JoinColumns({
            @JoinColumn(name = "cod_agency", nullable = false, updatable = false),
            @JoinColumn(name = "cod_business", nullable = false, updatable = false)
    })
    @ManyToOne(optional = false)
    private Agency agency;

    /*@MapsId("codBusiness")
    @ManyToOne(optional = false)
    @JoinColumn(name = "cod_business", nullable = false, updatable = false)
    private Agency codBusiness;*/
}
