import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class GaragemLocomotivas {
	private ArrayList<Locomotiva> locomotivas;

	public GaragemLocomotivas() throws FileNotFoundException {
		locomotivas = new ArrayList<Locomotiva>();
		Scanner in = new Scanner(new FileReader("garagemLocomotivas.txt"));
		int id, qntdMaxDeVagoes;
		double pesoMax;
		while (in.hasNextLine()) {
			String[] line = in.nextLine().split(",");
			id = Integer.parseInt(line[0]);
			pesoMax = Double.parseDouble(line[1]);
			qntdMaxDeVagoes = Integer.parseInt(line[2]);
			Locomotiva locomotiva = new Locomotiva(id, pesoMax, qntdMaxDeVagoes);
			locomotivas.add(locomotiva);
		}
	}

	public void adicionaGaragem(Locomotiva locomotiva) {
		locomotivas.add(locomotiva);
	}

	public boolean removeGaragem(int id) {
		for (Locomotiva locomotiva : locomotivas) {
			if (locomotiva.getid() == id) {
				locomotivas.remove(id);
				return true;
			}
		}
		return false;
	}

	public int qtdade() {
		return locomotivas.size();
	}

	public Locomotiva getPorPosicao(int pos) {
		if (pos <= locomotivas.size() - 1 && pos >= 0) {
			return locomotivas.get(pos);
		} else {
			return null;
		}
	}

	public Locomotiva getPorId(int id) {
		for (Locomotiva locomotiva : locomotivas) {
			if (locomotiva.getid() == id) {
				return locomotiva;
			}
			;
		}
		return null;
	}

	public String toString() {
		return "Essa garagem tem " + qtdade() + " locomotivas";
	}
}