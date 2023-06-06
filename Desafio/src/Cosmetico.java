public class Cosmetico extends Loja{

    private double taxaComercializacao;

    public String tipoLoja = "Cosmetico";

    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double taxaComercializacao, int tamanhoEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoque);
        this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    @Override
    public String getTipoLoja() {
        return tipoLoja;
    }

    @Override
    public void setTipoLoja(String tipoLoja) {
        this.tipoLoja = tipoLoja;
    }

    @Override
    public String toString() {
        return "Cosmetico{" +
                super.toString() +
                "taxaComercializacao=" + taxaComercializacao +
                '}';
    }
}
