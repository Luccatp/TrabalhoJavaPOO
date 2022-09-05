import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class GaragemVagoes {
	private ArrayList<Vagao> vagoes;

	public GaragemVagoes() throws FileNotFoundException {
		vagoes = new ArrayList<Vagao>();
		Scanner in = new Scanner(new FileReader("garagemVagoes.txt"));
		int id;
		double capacidadeDeCarga;
		while (in.hasNextLine()) {
			String[] line = in.nextLine().split(",");
			id = Integer.parseInt(line[0]);
			capacidadeDeCarga = Double.parseDouble(line[1]);
			Vagao vagao = new Vagao(id, capacidadeDeCarga);
			vagoes.add(vagao);
		}
	}

	public void adicionaGaragem(Vagao v) {
		vagoes.add(v);
	}

	public boolean removeGaragem(int id) {
		for (Vagao vagao : vagoes) {
			if (vagao.getIdentificador() == id) {
				vagoes.remove(vagao);
				return true;
			}
		}
		return false;
	}

	public int qtdade() {
		return vagoes.size();
	}

	public Vagao getPorPosicao(int pos) {
		for (int i = 0; i < vagoes.size(); i++) {
			if (i == pos) {
				return vagoes.get(i);
			}
		}
		return null;
	}

	public Vagao getPorId(int id) {
		for (Vagao vagao : vagoes) {
			if (vagao.getIdentificador() == id) {
				return vagao;
			}
		}
		return null;
	}

	public String toString() {
		return "essa é a garagem de vagões e ela tem " + vagoes.size()
				+ " vagões";
	}
}