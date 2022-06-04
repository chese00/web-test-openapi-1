package com.casa.webtest1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.querydsl.binding.SingleValueBinding;

import com.querydsl.core.types.dsl.StringExpression;
import com.querydsl.core.types.dsl.StringPath;
import com.casa.webtest1.model.Persona;
import com.casa.webtest1.model.QPersona;

public interface PersonaRepository
		extends JpaRepository<Persona, Long>, QuerydslPredicateExecutor<Persona>, QuerydslBinderCustomizer<QPersona> {

	@Override
	default public void customize(QuerydslBindings bindings, QPersona root) {
		bindings.bind(String.class)
				.first((SingleValueBinding<StringPath, String>) StringExpression::containsIgnoreCase);
		bindings.excluding(root.genero);
	}
}
