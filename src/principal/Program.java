package principal;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Hashtable<Integer, String> dias = new Hashtable<>();

		dias.put(1, "Amor");
		dias.put(2, "Dias");
		dias.put(3, "Selva");
		dias.put(4, "Fam�lia");
		dias.put(5, "Alma");
		dias.put(6, "Medo");
		dias.put(7, "�gua");
		dias.put(8, "Horizonte");
		dias.put(9, "Beijos");
		dias.put(10, "Anjos");
		dias.put(11, "Destino");
		dias.put(12, "Chocolate");
		dias.put(13, "Beleza");
		dias.put(14, "Saudade");
		dias.put(15, "Rosas");
		dias.put(16, "Canto");
		dias.put(17, "Dan�a");
		dias.put(18, "Vingan�a");
		dias.put(19, "Flores");
		dias.put(20, "Mar");
		dias.put(21, "Esperan�a");
		dias.put(22, "Sexo");
		dias.put(23, "Hist�ria");
		dias.put(24, "Cora��o");
		dias.put(25, "Liberdade");
		dias.put(26, "Viver");
		dias.put(27, "Crise");
		dias.put(28, "Gritos");
		dias.put(29, "Guerra");
		dias.put(30, "Casos");
		dias.put(31, "Paix�o");

		Hashtable<Integer, String> meses = new Hashtable<>();

		meses.put(1, "E");
		meses.put(2, "Do(s)/ Da(s)/ De");
		meses.put(3, "Com");
		meses.put(4, "Sem");
		meses.put(5, "VS");
		meses.put(6, "No(s), Na(s)");
		meses.put(7, "Em");
		meses.put(8, "Para");
		meses.put(9, "Ou");
		meses.put(10, "�/ Ao/ A");
		meses.put(11, "Por/ Pelo(s)/ Pela(s)");
		meses.put(12, "Entre");

		Hashtable<Integer, String> letraNome = new Hashtable<>();

		letraNome.put(1, "Anjos");
		letraNome.put(2, "Destino");
		letraNome.put(3, "Gritos");
		letraNome.put(4, "Vida");
		letraNome.put(5, "Saudade");
		letraNome.put(6, "Rosas");
		letraNome.put(7, "Amor");
		letraNome.put(8, "Sereia");
		letraNome.put(9, "Selva");
		letraNome.put(0, "Alma");

		String nomeNovela = "";
		System.out.println("===============================================");
		System.out.println("	QUAL O NOME DA NOVELA DA SUA VIDA?");
		System.out.println("===============================================");
		System.out.print("Digite o dia do seu nascimento: ");
		Integer diaNasc = scanner.nextInt();

		for (Map.Entry<Integer, String> d : dias.entrySet())
			if (d.getKey() == diaNasc)
				nomeNovela = d.getValue();

		System.out.print("Digite o(s) d�gito(s) do m�s de seu nascimento: ");
		Integer mesNasc = scanner.nextInt();

		for (Map.Entry<Integer, String> m : meses.entrySet())
			if (m.getKey() == mesNasc)
				nomeNovela += " " + m.getValue();

		System.out.print("Digite o �ltimo d�gito de seu celular: ");
		Integer digitoCelular = scanner.nextInt();

		for (Map.Entry<Integer, String> l : letraNome.entrySet()) {

			if (l.getKey() == digitoCelular)
				nomeNovela += " " + l.getValue();

		}

		System.out.println("\nO nome da novela da sua vida � ..."
				+ "\n " + nomeNovela);
	}
}
