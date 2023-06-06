public class Alimentacao extends Loja{

    private Data dataAlvara;

    public String tipoLoja = "Alimentacao";

    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara, int tamanhoEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoque);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
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
        return "Alimentacao{" +
                super.toString() +
                "dataAlvara=" + dataAlvara +
                '}';
    }
}
