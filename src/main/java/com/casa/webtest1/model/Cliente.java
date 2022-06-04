package com.casa.webtest1.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name = "cliente")
@Getter
@Setter
/*@Builder(toBuilder = true)*/
@NoArgsConstructor
@AllArgsConstructor
public class Cliente extends Persona {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codigo_cliente")
    private Long id;
  
    private String cuenta;

    private String contrasenia;
    
    private Boolean estado;
   
    @Builder(builderMethodName = "clienteuilder")
    public Cliente (String identificacion, String nombre, String genero, String cuenta, String contrasenia, Boolean estado) {
    	super(identificacion, nombre, genero);
    	this.cuenta = cuenta;
    	this.contrasenia = contrasenia;
    	this.estado =  estado;
    		
    }


}