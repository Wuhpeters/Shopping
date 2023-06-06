import java.util.Arrays;

public class Loja{
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Data dataFundacao;
    private Endereco endereco;

    private Produto[] estoqueProdutos;

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao,int tamanhoEstoque){
        if(dataFundacao.verificaData(dataFundacao.getDia(), dataFundacao.getMes(), dataFundacao.getAno())){
            this.dataFundacao = dataFundacao;
        }
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.estoqueProdutos = new Produto[tamanhoEstoque];
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int tamanhoEstoque){
        if(dataFundacao.verificaData(dataFundacao.getDia(), dataFundacao.getMes(), dataFundacao.getAno())){
            this.dataFundacao = dataFundacao;
        }
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.estoqueProdutos = new Produto[tamanhoEstoque];
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    public double gastosComSalario(){
        if(this.salarioBaseFuncionario == -1){
            return -1;
        } else {
            return (this.quantidadeFuncionarios * this.salarioBaseFuncionario);
        }
    }

    public char tamanhoDaLoja(){
        if(this.quantidadeFuncionarios < 10){
            return 'P';
        } else if (this.quantidadeFuncionarios <= 30) {
            return 'M';
        } else {
            return 'G';
        }
    }

    public void imprimeProdutos(){
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if(estoqueProdutos[i] != null){
                System.out.println(estoqueProdutos[i].toString());
            }
        }
    }

    public boolean insereProduto(Produto produto){
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if(estoqueProdutos[i] == null){
                estoqueProdutos[i] = produto;
                return true;
            }
        }
        return false;
    }

    public boolean removeProduto(String nomeProduto){
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if(estoqueProdutos[i] != null && nomeProduto.equals(estoqueProdutos[i].getNome())){
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Loja{" +
                "nome='" + nome + '\'' +
                ", quantidadeFuncionarios=" + quantidadeFuncionarios +
                ", salarioBaseFuncionario=" + salarioBaseFuncionario +
                ", dataFundacao=" + dataFundacao +
                ", endereco=" + endereco +
                ", estoqueProdutos=" + Arrays.toString(estoqueProdutos) +
                '}';
    }
}
