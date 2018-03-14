package br.com.zanatta.webapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.zanatta.webapp.entity.GrupoEntity;
import br.com.zanatta.webapp.entity.UsuarioEntity;
 
@Repository
public interface GrupoRepository extends JpaRepository<GrupoEntity, Long>{
 
	List<GrupoEntity> findByUsuariosIn(UsuarioEntity usuarioEntity);
 
}
