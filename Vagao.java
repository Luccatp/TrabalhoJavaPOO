
public class Vagao extends ElementoTrem {
	private double capacidadeCarga;
	private int identificador;
	private Trem refTrem;

	public Vagao(int identificador, double capacidadeCarga) {
		this.identificador = identificador;
		this.capacidadeCarga = capacidadeCarga;
	}

	public int getIdentificador() {
		return identificador;
	}

	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public Trem getTrem() {
		return this.refTrem;
	}

	public boolean livre() {
		if (this.refTrem != null)
			return false;
		else
			return true;
	}

	public void setTrem(Trem trem) {
		this.refTrem = trem;
	}

	@Override
	public String toString() {
		return "Esse trem é o vagão " + this.identificador + " com capacidade de carga " + this.capacidadeCarga;
	}
}