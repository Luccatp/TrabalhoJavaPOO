import java.util.ArrayList;

public class PatioDeManobras {
	private ArrayList<Trem> trens;
	
	public PatioDeManobras(ArrayList<Trem> trens){
		this.trens = trens;
	}

	public void adicionaPatio(Trem trem){
    trens.add(trem);
	}

	public boolean removePatio(int id){
    for(Trem trem : trens) {
      if(trem.getID() == id) {
        trens.remove(id);
        return true;
      }
    }
    return false;
	}

	public int qtdade(){
		return trens.size();
	}

	public Trem getPorPosicao(int pos){
		if( pos <= trens.size() - 1 && pos >= 0) {
      return trens.get(pos);
    } else {
      return null;
    }
	}

	public Trem getPorId(int id){
		for( Trem trem : trens ) {
      if(trem.getID() == id) {
        return trem;
      };
    }
    return null;
	}
	
	public String toString(){
		// TO DO
	}
}