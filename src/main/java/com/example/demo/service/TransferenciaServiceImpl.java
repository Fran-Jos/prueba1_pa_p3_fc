package com.example.demo.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.CuentaBancaria;
import com.example.demo.modelo.Transferencia;
import com.example.demo.repository.ICuentaBancariaRepository;
import com.example.demo.repository.ITransferenciaRepository;

@Service
public class TransferenciaServiceImpl  implements ITransferenciaService{
	@Autowired
	private ICuentaBancariaRepository bancariaRepository;
	@Autowired
	private ICuentaBancariaService bancariaService;
	@Autowired
	private ITransferenciaRepository iTransferenciaRepository;

	@Override
	public void crear(String cOrigen, String cDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
	

			// Cuenta origen
	
			CuentaBancaria origen = this.bancariaService.buscar(cOrigen);
			BigDecimal saldoOrigen = origen.getMonto();
			
			BigDecimal nuevoMonto = saldoOrigen.subtract(monto);
			
			origen.setMonto(nuevoMonto);
			this.bancariaService.actualizar(origen);

			// Cuenta destino
			CuentaBancaria destino = this.bancariaService.buscar(cDestino);
			BigDecimal saldoDestino = destino.getMonto();
			BigDecimal nuevoSaldoDestino = saldoDestino.add(monto);
			destino.setMonto(nuevoSaldoDestino);
			this.bancariaService.actualizar(destino);

			Transferencia transferencia = new Transferencia();
			transferencia.setCuentaOrigen(cOrigen);
			transferencia.setCuentaDestino(cDestino);
			transferencia.setMonto(monto);
			
			this.iTransferenciaRepository.insertar(transferencia);

		}
		


}
