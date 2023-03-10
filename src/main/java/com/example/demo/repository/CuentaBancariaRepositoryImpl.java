package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.CuentaBancaria;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


@Repository
@Transactional
public class CuentaBancariaRepositoryImpl implements ICuentaBancariaRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(CuentaBancaria bancaria) {
		// TODO Auto-generated method stub
		
		this.entityManager.persist(bancaria);
	}

	@Override
	public void actualizar(CuentaBancaria bancaria) {
		// TODO Auto-generated method stub
		this.entityManager.merge(bancaria);
		
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		
		
		
		return this.entityManager.find(CuentaBancaria.class, numero);
	}

	@Override
	public void borrar(String numero) {
		// TODO Auto-generated method stub
		
		CuentaBancaria bancariaaa = this.buscar(numero);
		
		this.entityManager.remove(bancariaaa);
		
	}

}
