package br.com.zanatta.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zanatta.webapp.entity.UsuarioEntity;
 
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
 
	UsuarioEntity findByLogin(String login);
 
}
