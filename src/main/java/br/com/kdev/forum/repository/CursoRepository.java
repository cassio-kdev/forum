package br.com.kdev.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.kdev.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nome);

}
