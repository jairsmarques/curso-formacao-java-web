import javax.swing.JOptionPane;

public class CriandoEntradaDeDados {

	public static void main(String[] args) {

		String carros = JOptionPane.showInputDialog("Informe a quuantidade de carros");
		String pessoas = JOptionPane.showInputDialog("Informe a quuantidade de pessoas");

		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);

		int divisao = (int) (carroNumero / pessoaNumero);
		int resto = (int) (carroNumero % pessoaNumero);

		JOptionPane.showMessageDialog(null,
				"Divisão por pessoas deu " + divisao + " carros e sobrou " + resto + " carro(s)");

	}

}
