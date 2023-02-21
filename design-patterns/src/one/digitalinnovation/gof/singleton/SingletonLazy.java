package one.digitalinnovation.gof.singleton;


/**
 * Lazy Singleton num primeiro momento não disponibiliza a instância para o usuário 
 * @author brims
 *
 */
public class SingletonLazy {
	
	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		
	}
	
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}

}
