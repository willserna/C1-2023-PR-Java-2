package ec.com.students.sofka.api.usecases.interfaces;

import ec.com.students.sofka.api.domain.dto.StudentDTO;
import reactor.core.publisher.Mono;

@FunctionalInterface
public interface SaveStudent {

    Mono<StudentDTO> save(StudentDTO studentDTO);
}