public class Locomotiva {
  
  private int id;
  private double pesoMax;
  private int qtdadeMaxVagoes;

public locomotiva (int id, double pesoMax, int qtdadeMaxVagoes) {

this.id = id;
this.pesoMax = pesoMax;
this.qtdadeMaxVagoes = qtdadeMaxVagoes;

}
public int getid() {
  return id;
}

public double getPesoMax {
  return pesoMax
}

public int getQtdeMaxVagoes() {
  return qtdadeMaxVagoes
}
public Trem getTrem() {
  return trem;
}

public boolean livre () {
  return true;
}

public void setTrem(Trem trem){
        return trem;
    }

public String toString () {
  String locomotivasName = "";
  for (Locomotiva locomotiva:locomotivas){
      locomotivasName += String.valueOf(vagao.getid());
    };
  return locomotivasName;
}
}
