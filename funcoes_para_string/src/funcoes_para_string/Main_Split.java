package funcoes_para_string;

public class Main_Split {

	public static void main(String[] args) {
		/* o método split() é usado para dividir uma string em partes com base em um delimitador ou expressão regular.
		Ele retorna um array de strings contendo os substrings resultantes da divisão. */
		
		// Exemplo 1:
		String s = "JavaScript TypeScript NodeJS MySQL";
		
		String[] vect = s.split(" ");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
		
		// Exemplo 2:
		String texto = "Java,Python C++";
        String[] linguagens = texto.split("[, ]");
        
        for (String linguagem : linguagens) {
            System.out.println(linguagem);
        }
        
        // Exemplo 3:
        String frase = "Java é uma linguagem poderosa";
        String[] palavras = frase.split(" ");
        
        for (String palavra : palavras) {
            System.out.println(palavra);
        }

	}

}
