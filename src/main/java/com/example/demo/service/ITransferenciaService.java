package com.example.demo.service;

import java.math.BigDecimal;

import com.example.demo.modelo.Transferencia;

public interface ITransferenciaService {

	public void crear(String cOrigen , String cDestino , BigDecimal monto);
}
