package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.correccion.modelo.Cuenta;
import com.example.demo.correccion.service.ICuentaService;
//import com.example.demo.modelo.CuentaBancaria;
//import com.example.demo.modelo.Transferencia;
//import com.example.demo.service.ICuentaBancariaService;
//import com.example.demo.service.IRegistroService;
//import com.example.demo.service.ITransferenciaService;
import com.example.demo.correccion.service.ITransferenciaService;

@SpringBootApplication
public class Prueba1PaP3FcApplication implements CommandLineRunner {
//	
//	@Autowired
//	private ITransferenciaService iTransferenciaService;
//	@Autowired
//	private ICuentaBancariaService bancariaService;
//	
//	@Autowired
//	private IRegistroService iRegistroService;
	
	@Autowired
	private ICuentaService cuentaService;
	@Autowired
	private ITransferenciaService iTransferenciaService;
	

	public static void main(String[] args) {
		SpringApplication.run(Prueba1PaP3FcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		CuentaBancaria cuentaBancaria = new CuentaBancaria();
//		cuentaBancaria.setCedulaPropietario("3131321");
//		cuentaBancaria.setMonto(new BigDecimal(200));
//		cuentaBancaria.setNumero("213");
//		cuentaBancaria.setTipo("ahorros");
//		
//		this.bancariaService.insertar(cuentaBancaria);
//		
//		CuentaBancaria cuentaBancaria2 = new CuentaBancaria();
//		cuentaBancaria2.setCedulaPropietario("313656");
//		cuentaBancaria2.setMonto(new BigDecimal(400));
//		cuentaBancaria2.setNumero("21333");
//		cuentaBancaria2.setTipo("ahorros");
//		this.bancariaService.insertar(cuentaBancaria2);
//	
		
		Cuenta cuenta = new Cuenta();
		cuenta.setCedulaPropietario("123123123");
		cuenta.setNumero("1");
		cuenta.setSaldo(new BigDecimal(26600));
		cuenta.setTipo("Ahorros");
		
		this.cuentaService.guardar(cuenta);
		
		Cuenta cuenta1 = new Cuenta();
		cuenta1.setCedulaPropietario("123123123");
		cuenta1.setNumero("2");
		cuenta1.setSaldo(new BigDecimal(266));
		cuenta1.setTipo("Ahorros");
		
		this.cuentaService.guardar(cuenta1);
		
		this.iTransferenciaService.realizar("1", "2", new BigDecimal(111));
	System.out.println(cuenta.getSaldo());
	System.out.println("el saldo actual es:");
	System.out.println(this.cuentaService.encontrar("2").getSaldo());
	
	}

}
