package ex02.entities;

public class Produto {
    private String mercadoria, descricao;
    private double valor;

    public Produto(String mercadoria, String descricao, double valor) {
        this.mercadoria = mercadoria;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getMercadoria() {
        return mercadoria;
    }

    public void setMercadoria(String mercadoria) {
        this.mercadoria = mercadoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
