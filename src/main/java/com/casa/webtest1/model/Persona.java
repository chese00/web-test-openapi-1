package com.casa.webtest1.model;



import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GenerationType;
@Entity
@Table(name = "persona")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor()
@Inheritance(strategy = InheritanceType.JOINED)
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codigo_persona")
    private Long id;

    private String identificacion;
    
    private String nombre;
    
    private String genero;

    @Builder
	public Persona(String identificacion, String nombre, String genero) {
		super();
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.genero = genero;
	}

  

}