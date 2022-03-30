package br.com.kdev.forum.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.kdev.forum.modelo.Curso;

@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)//configuracao para utilizar db diferente do h2
@DataJpaTest
@ActiveProfiles("test")
public class CursoRepositoryTest {
	
	@Autowired
	private CursoRepository repository;
	
	@Autowired
	private TestEntityManager em;

	@Test
	public void deveriaCarregarUmCursoPeloNome() {
		String nomeCurso = "HTML 5";
		
		Curso html5 = new Curso(nomeCurso, "Programação");
		em.persist(html5);
		
		Curso curso = repository.findByNome(nomeCurso);
		System.out.println(curso.getNome());
		Assert.assertNotNull(curso);
		Assert.assertEquals(nomeCurso, curso.getNome());
		
	}

}
