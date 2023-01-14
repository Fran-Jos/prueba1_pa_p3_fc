package com.example.demo.service;

import com.example.demo.modelo.Registro;

public interface IRegistroService {
	
	public void insertar(Registro registro);
	public void actualizar(Registro registro);
	public Registro buscar(Integer id);
	public void borrar(Integer id);

}
