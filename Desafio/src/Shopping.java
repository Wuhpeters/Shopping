import java.util.Arrays;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int quantidadeLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeLojas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nome) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && nome.equals(lojas[i].getNome())) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipoLoja) {

        int quantidadeLojas = 0;
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && tipoLoja.equals(lojas[i].getTipoLoja())) {
                quantidadeLojas++;
            }
        }
        return quantidadeLojas != 0 ? quantidadeLojas : -1;
    }

    public Loja lojaSeguroMaisCaro() {

        Loja lojaMaisCara = null;
        double maiorSeguro = 0.0;

        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && "Informatica".equals(lojas[i].getTipoLoja())) {
                Informatica informatica = (Informatica) lojas[i];
                double valorSeguro = informatica.getSeguroEletronicos();
                if(maiorSeguro < valorSeguro){
                    maiorSeguro = valorSeguro;
                    lojaMaisCara = lojas[i];
                }
            }
        }
        return lojaMaisCara;
    }

    @Override
    public String toString() {
        return "Shopping{" +
                "nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", lojas=" + Arrays.toString(lojas) +
                '}';
    }
}
