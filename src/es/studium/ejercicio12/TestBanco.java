package es.studium.ejercicio12;

public class TestBanco
{

	public static void main(String[] args)
	{
		Cliente cliente1 = new Cliente("48558238G", "Antonio Alonso", "C/Pepardo");
		Cuenta cuenta1 = new Cuenta(324, 100, cliente1);
		System.out.println("La cuenta de " + cuenta1.getCliente().getNombre() + " tiene " + cuenta1.getSaldo() + " euros.");
		
		Cliente cliente2 = new Cliente("34934275H", "Beatriz Benítez", "C/Nashitito");
		Cuenta cuenta2 = new Cuenta(23,  200, cliente2);
		System.out.println("La cuenta de " + cuenta2.getCliente().getNombre() + " tiene " + cuenta2.getSaldo() + " euros.");
		
		cuenta1.setSaldo(150);
		System.out.println("La cuenta de " + cuenta1.getCliente().getNombre() + " tiene " + cuenta1.getSaldo() + " euros.");
		
		cuenta2.setSaldo(250);
		System.out.println("La cuenta de " + cuenta2.getCliente().getNombre() + " tiene " + cuenta2.getSaldo() + " euros.");
	}

}
