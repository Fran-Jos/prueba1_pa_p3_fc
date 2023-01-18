package com.example.demo.correccion.service;

import java.math.BigDecimal;

public interface ITransferenciaService {

	public void realizar(String nOrigen , String nDestino , BigDecimal monto);
}
