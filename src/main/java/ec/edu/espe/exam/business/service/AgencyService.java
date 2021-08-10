package ec.edu.espe.exam.business.service;

import ec.edu.espe.exam.business.dao.AgencyRepository;
import ec.edu.espe.exam.business.model.Agency;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AgencyService {
    @NonNull
    private final AgencyRepository agencyRepository;

    public List<Agency> getAll(){
        return agencyRepository.findAll();
    }

    public List<Agency> getByBusiness(String codBusiness){
        return agencyRepository.findByCodBusiness(codBusiness);
    }

    /*public List<Agency> getByCodes(List<String> codAgencies){
        List<Agency> agencies = new ArrayList<Agency>();
        for(String code: codAgencies){
            Agency a = agencyRepository.getById()
        }
    }*/
}
