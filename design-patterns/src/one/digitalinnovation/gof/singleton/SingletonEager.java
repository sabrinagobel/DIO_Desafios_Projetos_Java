package one.digitalinnovation.gof.singleton;


/**
 * Eager Singleton disponibiliza a instância para o usuário já de início
 * @author brims
 *
 */
public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}

}