package android.vm.shopping;

/**
 * Created by Alessio-Valeria on 27/01/2017.
 */

public class Items {

    private String Nome;
    private Double prezzo;
    private int quantita;

    public Items(){}

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }
}
