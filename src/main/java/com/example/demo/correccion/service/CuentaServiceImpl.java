package com.example.demo.correccion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.correccion.modelo.Cuenta;
import com.example.demo.correccion.repository.ICuentaRepo;

@Service
public class CuentaServiceImpl implements ICuentaService {

	
	@Autowired
	private ICuentaRepo cuentaRepo;
	
	@Override
	public void guardar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		
		cuentaRepo.insertar(cuenta);
	}

	@Override
	public void modificar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.cuentaRepo.actualizar(cuenta);
	}

	@Override
	public Cuenta encontrar(String numero) {
		// TODO Auto-generated method stub
		return this.cuentaRepo.buscar(numero);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		this.cuentaRepo.eliminar(numero);
	}

}
