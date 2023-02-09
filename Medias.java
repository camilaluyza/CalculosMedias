package Media;

import javax.swing.JOptionPane;

public class Medias {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String m = JOptionPane.showInputDialog("Insira seu nome");
        System.out.println(m);
		
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota"));
		float nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a terceira nota"));
		
		float media = (nota1 * 2 + nota2 * nota3 * 5) / 10;
		
		String resultado;
		if(media >= 7) {
			resultado = "você foi aprovado";
		}else if(media >= 4) {
			resultado = "você está de recuperação";
		}else {
			resultado = "você foi reprovado";
		}
		
		JOptionPane.showMessageDialog(null, "Sua media foi: " + media +"- " + resultado);
	}

}
