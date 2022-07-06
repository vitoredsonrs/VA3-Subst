package va3;

import java.util.*;

public class Treino extends Atividade{
    
    private List<Atividade> atividades = new ArrayList<>();

    public Treino(String nome, float carga, int repeticoes) {
        super(nome, carga, repeticoes);
    }

    
        
}
   


/* public void receberNave(Nave nave){
        if(nave.pousar()){
            System.out.println("Nave sendo estacionada.");
            navesEstacionadas.add(nave);
        }else {
            System.out.println("Nave "+ nave.getId() + " já está estacionada.");
        }
    }*/