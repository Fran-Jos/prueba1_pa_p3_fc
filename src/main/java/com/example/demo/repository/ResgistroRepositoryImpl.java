package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.CuentaBancaria;
import com.example.demo.modelo.Registro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ResgistroRepositoryImpl implements IRegistroRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Registro registro) {
		// TODO Auto-generated method stub
		this.entityManager.persist(registro);
	}

	@Override
	public void actualizar(Registro registro) {
		// TODO Auto-generated method stub
		this.entityManager.merge(registro);
		
	}

	@Override
	public Registro buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Registro.class, id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		
		Registro registroo = this.buscar(id);
		
		this.entityManager.remove(registroo);
	}

}
