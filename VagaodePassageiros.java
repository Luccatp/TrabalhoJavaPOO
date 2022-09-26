public class VagaodePassageiros extends Vagao {

	int passageiros;

	public VagaodePassageiros(int id, int passageiros) {
		super(id, 75 * passageiros);
		this.passageiros = passageiros;
	}
}