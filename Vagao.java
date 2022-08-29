
public class Vagao {
	private double capacidadeCarga;
	private int identificador;

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

	/*
	 * public Trem getTrem(){
	 * return new Trem()
	 * }
	 */

	public boolean livre() {
		return true; // WTF O QUE TA LIVRE?
	}

	public void setTrem(Trem trem){
        return 
    }

	@Override
	public String toString() {
		// O que fazer aqui? me dê regra de negócio.
		return super.toString();
	}
}