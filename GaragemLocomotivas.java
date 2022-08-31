import java.util.ArrayList;

public class GaragemLocomotivas {
	private ArrayList<Locomotiva> locomotivas;
	
	public GaragemLocomotivas(){
		locomotivas = new ArrayList<locomotiva> locomotivas();
	}

	public void adicionaGaragem(Locomotiva l){
		locomotivas.add(locomotiva);
	}

	public boolean removeGaragem(int id){
		 for(Locomotiva locomotiva : locomotivas) {
      if(locomotiva.getid() == id) {
        locomotivas.remove(id);
        return true;
      }
    }
    return false;
	}

	public int qtdade(){
		return locomotivas.size();
	}

	public Locomotiva getPorPosicao(int pos){
		if( pos <= locomotivas.size() - 1 && pos >= 0) {
      return locomotivas.get(pos);
    } else {
      return null;
    }
	}

	public Locomotiva getPorId(int id){
		for( Locomotiva locomotiva : locomotivas ) {
      if(locomotiva.getid() == id) {
        return locomotiva;
      };
    }
    return null;
	}

	public String toString(){
		// TO DO
	}
}