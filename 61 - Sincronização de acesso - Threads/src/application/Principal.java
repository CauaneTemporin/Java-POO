package application;

public class Principal {

	public static void main(String[] args) {

		Banheiro banheiro = new Banheiro();

		// Passando a tarefa e o nome do Thread
		Thread convidado1 = new Thread(new TarefaNumero1(banheiro), "João");
		Thread convidado2 = new Thread(new TarefaNumero2(banheiro), "Pedro");
		Thread convidado3 = new Thread(new TarefaNumero1(banheiro), "Ana");
		Thread convidado4 = new Thread(new TarefaNumero2(banheiro), "Carla");
		Thread limpeza = new Thread(new TarefaLimpeza(banheiro), "Limpeza");

		limpeza.setDaemon(true);

		convidado1.start();
		convidado2.start();
		convidado3.start();
		convidado4.start();
		limpeza.start();
	}
}