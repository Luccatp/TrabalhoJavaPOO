
public class Vagao extends ElementoTrem {
	private double capacidadeCarga;
	private int identificador;

	public Vagao(int id, double capacidadeCarga) {
		super.setId(id);
		this.capacidadeCarga = capacidadeCarga;
	}

	public int getIdentificador() {
		return super.getId();
	}

	public double getCapacidadeCarga() {
		return capacidadeCarga;
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
		return "Esse trem é o vagão " + this.identificador + " com capacidade de carga " + this.capacidadeCarga;
	}
}