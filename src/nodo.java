
public class nodo<T> {
	private T dato;
	private nodo<T> siguiente;
	
	public nodo(T dato, nodo<T> siguiente){
		this.dato = dato;
		this.siguiente = siguiente;
	}
	
	public void apuntanex(nodo cima){
		this.siguiente = cima;
	}
}
