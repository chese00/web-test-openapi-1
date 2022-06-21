package com.casa.webtest1.repository;

import com.casa.webtest1.model.Persona;
import com.casa.webtest1.model.QPersona;
import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class Persona1Repository {
	@PersistenceContext
	private EntityManager em;

	@Transactional
	public Persona save(final Persona persona) {
		em.persist(persona);
		return persona;
	}

	public List<Persona> findAll() {
		final JPAQuery<Persona> query = new JPAQuery<>(em);
		QPersona persona = QPersona.persona;
		QPersona persona1 = QPersona.persona;
		return query.from(persona).leftJoin(persona1).on(persona.id.eq(persona1.id)).fetch();
	}

}
