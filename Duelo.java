class Duelo{

  
    void Duelar(Player P1, Player P2){
      
      
      if (P1.getCajado() > P2.getAnel()){
        System.out.println("Player 1 (Dano de Ataque = "+P1.getCajado()+" ) Venceu Player 2! (Dano de Defesa = "+ P2.getAnel()+" )");
      }

      else if(P1.getCajado() < P2.getAnel()){
        System.out.println("Player 1 (Dano de Ataque = "+P1.getCajado()+" ) foi derrotado por Player 2! (Dano de Defesa = "+ P2.getAnel()+" )");
      }

      else if(P1.getCajado() == P2.getAnel()){
        System.out.println("Player 1 (Dano de Ataque = "+P1.getCajado()+" ) empatou com Player 2! (Dano de Defesa = "+ P2.getAnel()+" )");
      }
  
}
}