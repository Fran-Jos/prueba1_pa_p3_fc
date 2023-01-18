package com.example.demo.correccion.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "transfer")
public class Transferencia {
	
	@Id
	@SequenceGenerator(name = "seq_tranfer", sequenceName = "seq_transfer", allocationSize = 1)
	@GeneratedValue(generator = "seq_transfer",strategy = GenerationType.SEQUENCE)
	@Column(name = "tran_id")
	private Integer id;
	@Column(name = "tran_fecha")
	private LocalDateTime fecha;
	@Column(name = "tran_origen")
	private String numeroOrigen;
	@Column(name = "tran_destino")
	private String numeroDestiono;
	@Column(name = "tran_monto")
	private BigDecimal monto;
	@Column(name = "tran_comision")
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
	public String getNumeroOrigen() {
		return numeroOrigen;
	}
	public void setNumeroOrigen(String numeroOrigen) {
		this.numeroOrigen = numeroOrigen;
	}
	public String getNumeroDestiono() {
		return numeroDestiono;
	}
	public void setNumeroDestiono(String numeroDestiono) {
		this.numeroDestiono = numeroDestiono;
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
	@Override
	public String toString() {
		return "Transferencia [id=" + id + ", fecha=" + fecha + ", numeroOrigen=" + numeroOrigen + ", numeroDestiono="
				+ numeroDestiono + ", monto=" + monto + ", comision=" + comision + "]";
	}
	

}
