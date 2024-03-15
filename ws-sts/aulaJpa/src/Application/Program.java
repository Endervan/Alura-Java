package Application;

import dominio.Pessoa;

public class Program {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(1,"Carlos Silva", "Carlos@gmail.com");
		Pessoa p2 = new Pessoa(2,"Adao", "adao@gmail.com");
		Pessoa p3 = new Pessoa(3,"Jurema", "jurema@gmail.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
	}

}
