package va3;
public class AvaliacaoFisica {
    private float peso, altura, imc;

    public AvaliacaoFisica(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public void relatorioDoAluno(){
        imc = peso /(altura * altura);
        System.out.println("IMC: "+imc); 
        
    }
    
    
}
