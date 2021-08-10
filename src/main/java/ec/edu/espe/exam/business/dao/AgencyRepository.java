package ec.edu.espe.exam.business.dao;

import ec.edu.espe.exam.business.model.Agency;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AgencyRepository extends JpaRepository<Agency, String> {
    List<Agency> findByCodBusiness(String codBusiness);
}
