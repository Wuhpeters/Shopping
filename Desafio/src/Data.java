public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (verificaData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }

        else {
            System.out.println("DATA INVÁLIDA");
            this.dia = 01;
            this.mes = 01;
            this.ano = 2023;
        }
    }

    public boolean verificaData(int dia, int mes, int ano) {
        if (ano < 1) return false;
        if (mes < 1 || mes > 12) return false;
        if (dia < 1 || dia > diasNoMes(mes, ano)) return false;
        return true;
    }

    private int diasNoMes(int mes, int ano) {
        switch (mes) {
            case 2:
                if (verificaAnoBissexto()) {
                    return 29;
                } else {
                    return 28;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }


    public boolean verificaAnoBissexto() {
        if ((ano % 4 == 0) && (ano % 100 != 0)) {
            return true;
        } else if (ano % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Data{" +
                "dia=" + dia +
                ", mes=" + mes +
                ", ano=" + ano +
                '}';
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
