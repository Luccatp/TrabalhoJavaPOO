public class Locomotiva extends ElementoTrem {

	private double pesoMax;
	private int qtdadeMaxVagoes;

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
		return super.getTrem();
	}

	public boolean livre() {
		return super.livre();
	}

	public void setTrem(Trem trem) {
		super.setTrem(trem);
	}

	@Override
	public String toString() {
		return "locomotiva com id " + super.getId() + " consegue carregar " + getPesoMax();
	}
}
