package com.example.demo.correccion.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.correccion.modelo.Cuenta;
import com.example.demo.correccion.modelo.Transferencia;
import com.example.demo.correccion.repository.ICuentaRepo;
import com.example.demo.correccion.repository.ITransferenciaRepo;

@Service
public class TransferenciaServiceImpl implements ITransferenciaService {

	@Autowired
	private ICuentaRepo cuentaRepo;
	@Autowired
	private ITransferenciaRepo iTransferenciaRepo;
	@Override
	public void realizar(String nOrigen, String nDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		
		Cuenta cuentaOrigen = this.cuentaRepo.buscar(nOrigen);
		BigDecimal comision = monto.multiply(new BigDecimal(0.05));
		BigDecimal montoDebitar = monto.add(comision);
		
		
		BigDecimal saldoActualOrigen = cuentaOrigen.getSaldo();
		
		
	    //-1 si el de la izq es <
	    if (saldoActualOrigen.compareTo(montoDebitar)<=0) {
			System.out.println("monto no permitido");
		}else {
			
			//origen 
			cuentaOrigen.setSaldo(saldoActualOrigen.subtract(montoDebitar));
		    this.cuentaRepo.actualizar(cuentaOrigen);
			
		    //destino
			Cuenta cuentaDestino = this.cuentaRepo.buscar(nDestino);
			BigDecimal saldoActualDestino = cuentaDestino.getSaldo();
			cuentaDestino.setSaldo(saldoActualDestino.add(monto));
			
			//transferencia
			
			Transferencia transferencia = new Transferencia();
			
			transferencia.setComision(comision);
			transferencia.setFecha(LocalDateTime.now());
			transferencia.setMonto(monto);
			transferencia.setNumeroDestiono(nDestino);
			transferencia.setNumeroOrigen(nOrigen);
			
			this.iTransferenciaRepo.insertar(transferencia);
			
		}
	    
		
	}

}
