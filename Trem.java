import java.util.ArrayList;

public class Trem {
	private int id;
	private ArrayList<Locomotiva> locomotivas;
	private ArrayList<Vagao> vagoes;

	public Trem(int id) {
		locomotivas = new ArrayList<Locomotiva>();
		vagoes = new ArrayList<Vagao>();
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
		for (Locomotiva locomotiva : locomotivas) {
			pesoMax += locomotiva.getPesoMax();
		}
		if (getQtdadeLocomotivas() > 1) {
			return pesoMax - pesoMax * (0.1 * (getQtdadeLocomotivas() - 1));
		}
		return pesoMax;
	}

	public double pesoAtualNoTrem() {
		double pesoAtual = 0;
		for (Vagao vagao : vagoes) {
			pesoAtual += vagao.getCapacidadeCarga();
		}
		return pesoAtual;
	}

	public boolean engataLocomotiva(Locomotiva locomotiva) {
		if (getQtdadeVagões() == 0) {
			locomotivas.add(locomotiva);
			return true;
		}
		return false;
	}

	public boolean engataVagao(Vagao vagao) {
		if (getQtdadeLocomotivas() > 0 || maxVagoesNoTrem() > getQtdadeVagões()) {
			vagoes.add(vagao);
			return true;
		} else {
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
		return "Esse trem tem id " + getID();
	}
}