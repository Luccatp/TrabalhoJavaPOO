import java.util.ArrayList;

public class GaragemVagoes {
	private ArrayList<Vagao> vagoes;

	public GaragemVagoes(){
		vagoes = new ArrayList<>();
	}

	public void adicionaGaragem(Vagao v){
		vagoes.add(v);
	}

	public boolean removeGaragem(int id){
		for(int i = 0; i<vagoes.size(); i++){
			if(vagoes[i].id == id){
				vagoes.remove(i);
			}
		}
	}

	public int qtdade(){
		return vagoes.size();
	}

	public Vagao getPorPosicao(int pos){
		for (int i = 0; i < vagoes.size(); i++) {
			if (i == pos) {
				return vagoes[i];
			}
			else return null;
		}
	}

	public Vagao getPorId(int id){
		for (int i = 0; i < vagoes.size(); i++) {
			if (vagoes[i].id == id) {
				return vagoes[i];
			}
			else return null;
		}
	}
	
	public String toString(){
		return "essa é a garagem de vagões e ela tem " + vagoes.size()
				+ " vagões";
	}
}