public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto(String nome, double preco, Data dataValidade){
        if(dataValidade.verificaData(dataValidade.getDia(), dataValidade.getMes(), dataValidade.getAno())){
            this.dataValidade = dataValidade;
        }
        this.nome = nome;
        this.preco = preco;
    }

    public boolean estaVencido(Data dataAVerificar){
        if(dataAVerificar.getDia() >= dataValidade.getDia()){
            return true;
        }
        if(dataAVerificar.getMes() >= dataValidade.getMes()){
            return true;
        }
        if(dataAVerificar.getAno() >= dataValidade.getMes()){
            return true;
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataDeValidade) {
        this.dataValidade = dataDeValidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", dataValidade=" + dataValidade +
                '}';
    }
}
