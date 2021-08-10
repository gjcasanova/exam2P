package ec.edu.espe.exam.business.dto;

import ec.edu.espe.exam.business.model.Agency;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Builder
@Data
public class SimpleAgencySerializer {
    private String codAgency;
    private String codBusiness;
    private String name;

    public static SimpleAgencySerializer serializeOne(Agency agency) {
        return SimpleAgencySerializer.builder()
                .codAgency(agency.getCodAgency())
                .codBusiness(agency.getCodBusiness())
                .name(agency.getName())
                .build();
    }

    public static List<SimpleAgencySerializer> serializeMany(List<Agency> agencies) {
        List<SimpleAgencySerializer> result;
        result = new ArrayList<SimpleAgencySerializer>();
        for (Agency a : agencies) {
            result.add(serializeOne(a));
        }
        return result;
    }
}
