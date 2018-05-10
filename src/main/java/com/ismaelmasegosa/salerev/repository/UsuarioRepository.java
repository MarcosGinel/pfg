package com.ismaelmasegosa.salerev.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ismaelmasegosa.salerev.entities.Usuario;

@Repository("usuarioRepository")
public interface UsuarioRepository extends MongoRepository<Usuario, String> {

	public Optional<Usuario> findByDni(String dni);

	public Usuario findByEmail(String email);

}
