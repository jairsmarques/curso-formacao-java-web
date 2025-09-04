import javax.swing.JOptionPane;

public class CriandoUmaOpcaoDeConfirmacao {

	public static void main(String[] args) {

		String carros = JOptionPane.showInputDialog("Informe a quuantidade de carros");
		String pessoas = JOptionPane.showInputDialog("Informe a quuantidade de pessoas");

		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);

		int divisao = (int) (carroNumero / pessoaNumero);
		int resto = (int) (carroNumero % pessoaNumero);

		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");

		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "Divisão por pessoas deu " + divisao);
		}

		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto divisão?");

		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "resto da divisão " + resto);
		}
	}

}
