package projvendedor;


public class Vendedor {
    private String nome;
    private float valorTotalVendido;
    private float meta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValorTotalVendido() {
        return valorTotalVendido;
    }

    public void setValorTotalVendido(float valorTotalVendido) {
        this.valorTotalVendido = valorTotalVendido;
    }

    public float getMeta() {
        return meta;
    }

    public void setMeta(float meta) {
        this.meta = meta;
    }
    
    public float calcularComissao(){
        float percentualXMeta = this.valorTotalVendido / this.meta;
        
        if (percentualXMeta < 0.5){
            return this.valorTotalVendido * 0.01f;
        }else if(percentualXMeta <= 0.75){
            return this.valorTotalVendido * 0.025f;
        }else if(percentualXMeta <= 1){
            return this.valorTotalVendido * 0.035f;
        }else{
            return this.valorTotalVendido * 0.05f;
        }
        
    }

    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nValor Total Vendido: R$" + valorTotalVendido + 
                "\nMeta: R$" + meta + 
                "\nValor da Comissão: R$" + this.calcularComissao();
    }
    
    
}
