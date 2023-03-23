package ejercicio4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Ejercicio4 {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		List.of(13, -5, 21, -101, 73, 67).forEach(q::offer);
		modificarCola(q);
		System.out.println(q);
	}
	
	
	
	public static void modificarCola(Queue<Integer> q) {
		if(q == null || q.size()%2!=0 || q.size()==0)
			throw new IllegalArgumentException();


		Deque<Integer> cola = new LinkedList<>();
		Deque<Integer> cola2 = new LinkedList<>();
		Deque<Integer> cola3 = new LinkedList<>();
		int num;
		// Paso la mitad a dos colas
		for(int i= 0; i<= q.size()/2; i++) {
			num = q.poll();
			cola.offer(num);
			cola2.offer(num);
		}
		
		// Paso la segunda cola aux a la primera por atras, dejando el orden inverso
		while(!cola2.isEmpty())
			cola.offer(cola2.pollLast());
		
		// Paso la segunda mitad a otras dos colas
		for(int i = 0; i <= q.size()+1; i++) {
			num = q.poll();
			cola2.offer(num);
			cola3.offer(num);
		}
		
		
		// Paso la tercera cola aux a la segunda por atras, dejando el orden inverso
		while(!cola3.isEmpty())
			cola2.offer(cola3.pollLast());
		
		// Paso las dos colas a la cola original
		while(!cola.isEmpty())
			q.offer(cola.poll());
		
		while(!cola2.isEmpty())
			q.offer(cola2.poll());
		
		
	}

}
