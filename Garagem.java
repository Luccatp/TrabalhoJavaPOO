import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Garagem {
	private ArrayList<Locomotiva> locomotivas;
	private ArrayList<Vagao> vagoes;

	public Garagem() throws FileNotFoundException {
		locomotivas = new ArrayList<Locomotiva>();
		Scanner locIn = new Scanner(new FileReader("garagemLocomotivas.txt"));
		int locId, qntdMaxDeVagoes;
		double pesoMax;
		while (locIn.hasNextLine()) {
			String[] line = locIn.nextLine().split(",");
			locId = Integer.parseInt(line[0]);
			pesoMax = Double.parseDouble(line[1]);
			qntdMaxDeVagoes = Integer.parseInt(line[2]);
			Locomotiva locomotiva = new Locomotiva(locId, pesoMax, qntdMaxDeVagoes);
			locomotivas.add(locomotiva);
		}
		vagoes = new ArrayList<Vagao>();
		Scanner vagoesIn = new Scanner(new FileReader("garagemVagoes.txt"));
		int vagoesId;
		double capacidadeDeCarga;
		while (vagoesIn.hasNextLine()) {
			String[] line = vagoesIn.nextLine().split(",");
			vagoesId = Integer.parseInt(line[0]);
			capacidadeDeCarga = Double.parseDouble(line[1]);
			Vagao vagao = new Vagao(vagoesId, capacidadeDeCarga);
			vagoes.add(vagao);
		}
	}

	public void adicionaVagoesGaragem(Vagao v) {
		vagoes.add(v);
	}

	public boolean removeVagoesGaragem(int id) {
		for (Vagao vagao : vagoes) {
			if (vagao.getIdentificador() == id) {
				vagoes.remove(vagao);
				return true;
			}
		}
		return false;
	}

	public int vagoesSize() {
		return vagoes.size();
	}

	public Vagao getVagoesPorPosicao(int pos) {
		for (int i = 0; i < vagoes.size(); i++) {
			if (i == pos) {
				return vagoes.get(i);
			}
		}
		return null;
	}

	public Vagao getVagoesPorId(int id) {
		for (Vagao vagao : vagoes) {
			if (vagao.getIdentificador() == id) {
				return vagao;
			}
		}
		return null;
	}

	public void adicionaLocGaragem(Locomotiva locomotiva) {
		locomotivas.add(locomotiva);
	}

	public boolean removeLocGaragem(int id) {
		for (Locomotiva locomotiva : locomotivas) {
			if (locomotiva.getId() == id) {
				locomotivas.remove(id);
				return true;
			}
		}
		return false;
	}

	public int locomotivasSize() {
		return locomotivas.size();
	}

	public Locomotiva getLocPorPosicao(int pos) {
		if (pos <= locomotivas.size() - 1 && pos >= 0) {
			return locomotivas.get(pos);
		} else {
			return null;
		}
	}

	public Locomotiva getLocPorId(int id) {
		for (Locomotiva locomotiva : locomotivas) {
			if (locomotiva.getId() == id) {
				return locomotiva;
			}
			;
		}
		return null;
	}

	public String toStringLoc() {
		return "Essa garagem tem " + locomotivasSize() + " locomotivas";
	}

	public String toStringVag() {
		return "essa é a garagem de vagões e ela tem " + vagoes.size()
				+ " vagões";
	}
}
