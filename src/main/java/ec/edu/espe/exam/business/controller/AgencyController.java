package ec.edu.espe.exam.business.controller;

import ec.edu.espe.exam.business.dto.SimpleAgencySerializer;
import ec.edu.espe.exam.business.model.Agency;
import ec.edu.espe.exam.business.service.AgencyService;
import lombok.Data;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Data
@RequestMapping("/api/v1/agencies")
@Slf4j
public class AgencyController {
    @NonNull
    private final AgencyService agencyService;

    @GetMapping("/{businessCode}/")
    public ResponseEntity getByBusiness(@PathVariable String businessCode) {
        List<Agency> agencies = agencyService.getByBusiness(businessCode);
        return ResponseEntity.ok(SimpleAgencySerializer.serializeMany(agencies));
    }

    @PostMapping("/users/{userCode}/agencies/")
    public ResponseEntity assignAgencies(@RequestBody List<String> agencieCodes){
        return ResponseEntity.noContent().build();
    }
}
