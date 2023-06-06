public class Vestuario extends Loja{

    private boolean produtosImportados;

    public String tipoLoja = "Vestuario";

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados, int tamanhoEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoque);
        this.produtosImportados = produtosImportados;
    }

    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
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
        return "Vestuario{" +
                super.toString() +
                "produtosImportados=" + produtosImportados +
                '}';
    }
}
