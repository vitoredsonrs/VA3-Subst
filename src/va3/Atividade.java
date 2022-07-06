package va3;
public abstract class Atividade {
    private String nomeAtividade;
    private float carga;
    private int repeticoes;
    private Aparelho aparelho;

    public Atividade(String nome, float carga, int repeticoes) {
        this.nomeAtividade = nome;
        this.carga = carga;
        this.repeticoes = repeticoes;
    }

    public String getNome() {
        return nomeAtividade;
    }

    public void setNome(String nome) {
        this.nomeAtividade = nome;
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }
    
    public void relatorioExercicios(){
         System.out.println("Nome atividade: " + nomeAtividade + "\nCarga da atividade: " + carga + "\nNúmero de repetições: "+ repeticoes+"\nAparelho: "+ this.aparelho);

    }
    
}