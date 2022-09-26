public class Locomotiva extends ElementoTrem {

	private double pesoMax;
	private int qtdadeMaxVagoes;
	private Trem trem;

	public Locomotiva(int id, double pesoMax, int qtdadeMaxVagoes) {
		super.setId(id);
		this.pesoMax = pesoMax;
		this.qtdadeMaxVagoes = qtdadeMaxVagoes;
	}

	public int getId() {
		return super.getId();
	}

	public double getPesoMax() {
		return pesoMax;
	}

	public int getQtdeMaxVagoes() {
		return qtdadeMaxVagoes;
	}

	public Trem getTrem() {
		return trem;
	}

	public boolean livre() {
		if (this.trem != null)
			return false;
		else
			return true;
	}

	public void setTrem(Trem trem) {
		this.trem = trem;
	}

	@Override
	public String toString() {
		return "locomotiva com id " + super.getId() + " consegue carregar " + getPesoMax();
	}
}
