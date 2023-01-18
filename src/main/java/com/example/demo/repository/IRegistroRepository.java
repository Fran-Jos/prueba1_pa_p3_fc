package com.example.demo.repository;

import com.example.demo.modelo.CuentaBancaria;
import com.example.demo.modelo.Registro;

public interface IRegistroRepository {
	
	public void insertar(Registro registro);
	public void actualizar(Registro registro);
	public Registro buscar(Integer id);
	public void borrar(Integer id);
	

}
