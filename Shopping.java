import java.util.Arrays;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int quantidadeMaximaDeLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeMaximaDeLojas];
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

    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equalsIgnoreCase(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipoDeLoja) {
        int contadorDeLoja = 0;
        for (Loja loja : lojas) {
            if (loja != null) {
                if (tipoDeLoja.equalsIgnoreCase("Cosmetico") && loja instanceof Cosmetico) {
                    contadorDeLoja++;
                } else if (tipoDeLoja.equalsIgnoreCase("Vestuario") && loja instanceof Vestuario) {
                    contadorDeLoja++;
                } else if (tipoDeLoja.equalsIgnoreCase("Bijuteria") && loja instanceof Bijuteria) {
                    contadorDeLoja++;
                } else if (tipoDeLoja.equalsIgnoreCase("Alimentacao") && loja instanceof Alimentacao) {
                    contadorDeLoja++;
                } else if (tipoDeLoja.equalsIgnoreCase("Informatica") && loja instanceof Informatica) {
                    contadorDeLoja++;
                } else {
                    System.out.println("Tipo de loja inválido.");
                }
            }
        }
        return contadorDeLoja == 0 ? -1 : contadorDeLoja;
    }

    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaMaisCara = null;
        double maiorSeguro = 0;
        for (Loja loja : lojas) {
            if (loja != null && loja instanceof Informatica) {
                Informatica lojaInformatica = (Informatica) loja; // downcasting
                if (lojaInformatica.getSeguroEletronicos() > maiorSeguro) {
                    maiorSeguro = lojaInformatica.getSeguroEletronicos();
                    lojaMaisCara = lojaInformatica;
                }
            }
        }
        return lojaMaisCara;
    }


    @Override
    public String toString() {
        return "Shopping: " + nome + ", Endereço: " + endereco + ", Quantidade de lojas desse tipo: " + lojas.length;
    }
}
