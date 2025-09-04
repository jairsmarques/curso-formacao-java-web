
public class OperadorTernarioSimples {

	public static void main(String[] args) {

		int nota1 = 10;
		int nota2 = 10;
		int nota3 = 10;
		int nota4 = 80;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		/* Operadores ternários são para micro validações */
		String saidaResultado;
		saidaResultado = media >= 70 ? "Aluno Aprovado" : (media >= 40 && media <= 69) ? "Aluno em recuperação" : "Aluno Reprovado";
		
		System.out.println(saidaResultado);
		
	}

}
