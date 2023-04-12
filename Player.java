class Player{

  private int danobaseatq = 17;
  private int danobasedef = 18;
  private int anel;
  private int cajado;
  
  public void setAnel(Anel x){

    this.anel = (danobasedef + x.getDef());
  }

  public int getAnel(){
    return this.anel;
  }

  public void setCajado(Cajado x){

    this.cajado = (danobaseatq + x.getAtq());
  }

  public int getCajado(){
    return this.cajado;
  }


 /* public int defender(){
    int x = (this.defesa + this.anel);
    return x;
  }

  public int atacar(){
    int x = (this.ataque + this.cajado);
    return x;
  }*/

  
}