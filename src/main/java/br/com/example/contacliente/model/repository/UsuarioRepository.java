package br.com.example.contacliente.model.repository;

import br.com.example.contacliente.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
