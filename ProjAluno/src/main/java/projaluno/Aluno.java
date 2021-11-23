
package projaluno;


public class Aluno {
    private String nome;
    private long ra;
    private double nota1;
    private double nota2;
    private int diasLetivos;
    private double quantidadeDeFaltas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getRa() {
        return ra;
    }

    public void setRa(long ra) {
        this.ra = ra;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public int getDiasLetivos() {
        return diasLetivos;
    }

    public void setDiasLetivos(int diasLetivos) {
        this.diasLetivos = diasLetivos;
    }

    public double getQuantidadeDeFaltas() {
        return quantidadeDeFaltas;
    }

    public void setQuantidadeDeFaltas(double quantidadeDeFaltas) {
        this.quantidadeDeFaltas = quantidadeDeFaltas;
    }
    
    public double calcularMedia(){
        return (this.nota1 + this.nota2) / 2;
    }
    
    public double calcularFrequencia(){
        return this.quantidadeDeFaltas / this.diasLetivos;
    }
    
    public String verificarSituacao(){
        
        if(calcularFrequencia() < 0.75 && calcularMedia() < 6){
            return "Reprovado!!";
        }else if(calcularFrequencia() < 0.75 && calcularMedia() >= 6){
            return "Aprovado por média e reprovado por frequência!!!";
        }else if(calcularFrequencia() >= 0.75 && calcularMedia() < 6){
            return "Reprovado por média e aprovado por frequência!!!";
        }else{
            return "Parabens, você foi Aprovado!!!";
        }        
    }

    @Override
    public String toString() {
        return  "\nNome: " + nome + 
                "\nRa: " + ra + 
                "\nNota 1: " + nota1 + 
                "\nNota 2: " + nota2 + 
                "\nMédia: " + calcularMedia() +
                "\nDias letivos: " + diasLetivos + 
                "\nQuantidade de faltas: " + quantidadeDeFaltas + 
                "\nSituação: " + verificarSituacao();
    }
    
    
}
