package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {
		
		String vazio = "    Alura    ";
		String outroVazio = vazio.trim();
		
		System.out.println(vazio.contains("Alu"));
		System.out.println(outroVazio);
		
		String nome = "Alura";//object literal
		//String outra = new String("Alura");
	
		System.out.println(nome.length());
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
//		String sub = nome.substring(1);
//		System.out.println(sub);
		
//		int pos = nome.indexOf("ur");
//		System.out.println(pos);
		
//		char c = nome.charAt(0); 
//para o java, o index de uma string come�a sempre na posi��o 0, portanto
//neste caso (2) o index � o caractere u pois o caractere A est� no index 0		
//		System.out.println(c);
		
//   	char c = 'A';
//		char d = 'a';
//		String outra = nome.replace(c , d);		
		
		String outra = nome.replace("A", "a");
		
		//String outra = nome.toUpperCase();
		nome.toLowerCase();
		
//		System.out.println(nome);
//		System.out.println(outra);
		
	}

}
//String � imut�vel, ent�o para alterar ela depois precisa de uma nova.
//a qual fa�a a altera��o necess�ria.
//String(sequ�ncia de caracteres representado por " ")
//char(um �nico caractere representado por ' ' )