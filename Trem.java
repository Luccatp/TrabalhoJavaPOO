import java.util.ArrayList;

public class Trem {
	private int id;
	private ArrayList<Locomotiva> locomotivas;
	private ArrayList<Vagao> vagoes;

	public Trem(int id) {
		this.id = id;
	}

	public int getID() {
		return this.id;
	}

	public int getQtdadeLocomotivas() {
		return this.locomotivas.size();
	}

	public Locomotiva getLocomotiva(int posicao) {
		return this.locomotivas.get(posicao);
	}

	public int getQtdadeVagões() {
		return this.vagoes.size();
	}

	public Vagao getVagao(int posicao) {
		return this.vagoes.get(posicao);
	}

	public int maxVagoesNoTrem() {
		return this.vagoes.size();
	}

	public double pesoMaxNoTrem() {
		double pesoMax = 0;
		locomotivas.forEach((locomotiva) -> {
			// pesoMax += locomotiva.getPesoMax()
		});
		return pesoMax;
	}

	public double pesoAtualNoTrem() {
		// tirar duvida com o professor
		return 0;
	}

	public boolean engataLocomotiva(Locomotiva locomotiva) {
		try {
			locomotivas.add(locomotiva);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean engataVagao(Vagao vagao) {
		try {
			vagoes.add(vagao);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean desengataLocomotiva() {
		if (locomotivas.size() > 1) {
			locomotivas.remove(-1);
			return true;
		} else {
			return false;
		}
	}

	public boolean desengataVagao() {
		if (vagoes.size() > 0) {
			vagoes.remove(-1);
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		return "Esse trem é o trem " + this.id + " ele tem " + " locomotivas e " + vagoes + " vagoes.";
	}
}