
public class Vagao {
	private double capacidadeCarga;
	private int identificador;
  private Trem trem;

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
	 * em qual trem ela ta
	 * }
	 */

	public boolean livre() {
		return true; 
	}

	public void setTrem(Trem trem){
        return 
    }

	@Override
	public String toString() {
		// O que fazer aqui? regra de negócio.
		return super.toString();
	}
}