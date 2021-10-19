package application;

import builder.EmentaBuilder;
import builder.PadroesCriacionaisBuilder;

public class App {

	public static void main(String[] args) {

		Client client = new Client();
		client.q1();
		
		client.order("Padroes Criacionais", new PadroesCriacionaisBuilder());
		client.order("EMenta Padroes Criacionais", new EmentaBuilder());
	}

}
