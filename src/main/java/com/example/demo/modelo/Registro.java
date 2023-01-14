package com.example.demo.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "registro")
public class Registro {
	
	@Column(name = "reg_id" )
	@SequenceGenerator(name = "cb_seq" , sequenceName = "cb_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "cb_seq")
	@Id
	private Integer id;
	@Column(name = "reg_fecha" )
	private LocalDateTime fecha;
	@Column(name = "reg_cOrigen" )
	private String cuentaOrigen;
	@Column(name = "reg_cDestino" )
	private String cuentaDestino;
	@Column(name = "reg_monto" )
	private BigDecimal monto;
	@Column(name = "reg_comision" )
	private BigDecimal comision;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public String getCuentaOrigen() {
		return cuentaOrigen;
	}
	public void setCuentaOrigen(String cuentaOrigen) {
		this.cuentaOrigen = cuentaOrigen;
	}
	public String getCuentaDestino() {
		return cuentaDestino;
	}
	public void setCuentaDestino(String cuentaDestino) {
		this.cuentaDestino = cuentaDestino;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public BigDecimal getComision() {
		return comision;
	}
	public void setComision(BigDecimal comision) {
		this.comision = comision;
	}
	
	

}
