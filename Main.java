class Main {
  public static void main(String[] args) {

    Player P1 = new Player();
    Player P2 = new Player();

    PedraAgua PA = new PedraAgua();
    PedraFogo PF = new PedraFogo();
    PedraAr PAr = new PedraAr();
    PedraTerra PT = new PedraTerra();

    Cajado C1 =  new Cajado();
    Anel A1 = new Anel();

    Duelo D1 = new Duelo();

    C1.setAtq(PA, PT);
    A1.setDef(PT);
    
    P1.setCajado(C1);
    P2.setAnel(A1);

    D1.Duelar(P1, P2);

    
    
    
  }
}