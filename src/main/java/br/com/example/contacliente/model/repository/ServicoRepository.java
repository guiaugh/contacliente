package br.com.example.contacliente.model.repository;

import br.com.example.contacliente.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
