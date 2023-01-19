package es.studium.ejercicio12;

public class Cuenta
{
	private int numeroCuenta;
	private double saldo;
	private Cliente cliente;
	
	public Cuenta()
	{
		numeroCuenta = 0;
		saldo = 0;
		cliente = new Cliente();
	}

	public Cuenta(int numeroCuenta, double saldo, Cliente cliente)
	{
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public int getNumeroCuenta()
	{
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta)
	{
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldo()
	{
		return saldo;
	}

	public void setSaldo(double saldo)
	{
		this.saldo = saldo;
	}

	public Cliente getCliente()
	{
		return cliente;
	}

	public void setCliente(Cliente cliente)
	{
		this.cliente = cliente;
	}
	
}	
