package com.example.demo.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Transferencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class TransferenciaRepositoryImpl implements ITransferenciaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		this.entityManager.persist(transferencia);
	}

	
}
