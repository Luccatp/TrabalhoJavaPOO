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
			pesoMax += locomotiva.getPesoMax();
		});
		return pesoMax;
	}

	public double pesoAtualNoTrem() {
		double pesoAtual = 0;
    for( Vagao vagao : vagoes) {
      pesoAtual += vagao.getCapacidadeCarga();
    }
		return pesoAtual;
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
    // calcular 10%
		double pesoMax = 0;
    double pesoAtual = 0;
    
    for( Locomotiva locomotiva : locomotivas) {
      pesoMax += locomotiva.getPesoMax();
    }
    for( Vagao vagaoPeso : vagoes) {
      pesoAtual += vagaoPeso.getCapacidadeCarga();
    }
    if( locomotivas.size() > 1) {
      pesoMax = pesoMax / 10 * locomotivas.size(); 
    }
    if( pesoMax > pesoAtual) {
      vagoes.add(vagao);
			return true;
    }	else {
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
    String vagaosName = "";
    for (Vagao vagao:vagoes){
      vagaosName += String.valueOf(vagao.getIdentificador());
    };
    return "Esse trem é o trem " + this.id + " ele tem " + " locomotivas e " + vagaosName + " vagoes.";
	}
}