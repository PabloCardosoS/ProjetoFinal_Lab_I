public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (verificarDataValida(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida! Definida para 1/1/2000.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
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

    public boolean verificaAnoBissexto() {
        return (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0));
    }

    public boolean verificarDataValida(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return false;
        }
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            return (dia >= 1 && dia <= 31);
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return (dia >= 1 && dia <= 30);
        } else if (mes == 2) {
            if (verificaAnoBissexto()) {
                return (dia >= 1 && dia <= 29);
            } else {
                return (dia >= 1 && dia <= 28);
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

}
