package ec.edu.espe.exam.business.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@Table(name = "test_user")
public class User implements Serializable {
    @Id
    @NonNull
    @Column(name = "cod_user", length = 30)
    private String codUser;

    @Column(name = "name", nullable = false, length = 150)
    private String name;

    @Column(name = "identity_card", nullable = false, length = 30)
    private String identityCard;

    @Column(name = "email", nullable = false, length = 250)
    private String email;

    @Column(name = "state", nullable = false, length = 3)
    private String state;

    @Column(name = "failed_attemps", nullable = false, scale = 5, precision = 0)
    private Long failedAttemps;

    @Temporal(TemporalType.DATE)
    @Column(name = "last_session_date", nullable = false)
    private Date lastSessionDate;
}
