class Cajado{

  private int ataque = 12;

  private int atqTotal;

  public void setAtq(PedraAgua pedra, PedraAgua pedra2){
      this.atqTotal = (pedra.dano + pedra2.dano + this.ataque);
   
  }

  public void setAtq(PedraAgua pedra, PedraFogo pedra2){
      this.atqTotal = (pedra.dano + pedra2.dano + this.ataque);
   
  }

  public void setAtq(PedraAgua pedra, PedraAr pedra2){
      this.atqTotal = (pedra.dano + pedra2.dano + this.ataque);
   
  }

  public void setAtq(PedraAgua pedra, PedraTerra pedra2){
      this.atqTotal = (pedra.dano + pedra2.dano + this.ataque);
   
  }

  public void setAtq(PedraFogo pedra, PedraFogo pedra2){
      this.atqTotal = (pedra.dano + pedra2.dano + this.ataque);
   
  }

  public void setAtq(PedraFogo pedra, PedraAr pedra2){
      this.atqTotal = (pedra.dano + pedra2.dano + this.ataque);
   
  }

  public void setAtq(PedraFogo pedra, PedraTerra pedra2){
      this.atqTotal = (pedra.dano + pedra2.dano + this.ataque);
   
  }

  public void setAtq(PedraFogo pedra, PedraAgua pedra2){
      this.atqTotal = (pedra.dano + pedra2.dano + this.ataque);
   
  }

  public void setAtq(PedraAr pedra, PedraAr pedra2){
      this.atqTotal = (pedra.dano + pedra2.dano + this.ataque);
   
  }

  public void setAtq(PedraAr pedra, PedraAgua pedra2){
      this.atqTotal = (pedra.dano + pedra2.dano + this.ataque);
   
  }

  public void setAtq(PedraAr pedra, PedraFogo pedra2){
      this.atqTotal = (pedra.dano + pedra2.dano + this.ataque);
   
  }

  public void setAtq(PedraAr pedra, PedraTerra pedra2){
      this.atqTotal = (pedra.dano + pedra2.dano + this.ataque);
   
  }

  public void setAtq(PedraTerra pedra, PedraTerra pedra2){
      this.atqTotal = (pedra.dano + pedra2.dano + this.ataque);
   
  }

  public void setAtq(PedraTerra pedra, PedraAr pedra2){
      this.atqTotal = (pedra.dano + pedra2.dano + this.ataque);
   
  }

  public void setAtq(PedraTerra pedra, PedraFogo pedra2){
      this.atqTotal = (pedra.dano + pedra2.dano + this.ataque);
   
  }

  public void setAtq(PedraTerra pedra, PedraAgua pedra2){
      this.atqTotal = (pedra.dano + pedra2.dano + this.ataque);
   
  }


  public int getAtq(){
    return atqTotal;
  }
}