package one.digitalinovation.desafio.orientadoobjeto.negocio;

import one.digitalinovation.desafio.orientadoobjeto.entidades.*;

public class Iphone implements internet, music, phone {

	@Override
	public void atender() {
		System.out.println("Atendendo chamada ... ");
	}

	@Override
	public void ligar() {
		System.out.println("Ligando ... ");
	}

	@Override
	public void tocar() {
		System.out.println("Tocando ... ");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando Música");
		
	}

	@Override
	public void navegar() {
		System.out.println("Navegando na internet ...");
		
	}
	
	public Iphone() {
		
	}
	
}
