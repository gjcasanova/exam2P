package ec.edu.espe.exam.business.controller;

import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
@RequestMapping("api/v1/pong")
public class PongController {
    @GetMapping
    public ResponseEntity pong() {
        ec.edu.espe.exam.business.dto.PongSerializer response = new ec.edu.espe.exam.business.dto.PongSerializer();
        return ResponseEntity.ok(response);
    }
}