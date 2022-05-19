package br.com.cargapesada.truckpass.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import br.com.cargapesada.truckpass.model.Motorista;

@Repository
@Component
public interface MotoristaRepository extends JpaRepository<Motorista, Long> {

}
