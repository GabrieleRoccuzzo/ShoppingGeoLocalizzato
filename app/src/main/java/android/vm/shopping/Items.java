package android.vm.shopping;

/**
 * Created by Alessio-Valeria on 27/01/2017.
 */

public class Items {

    private String Nome;
    private double prezzo;
    private int quantita;

    public Items(){}

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getPrezzo() {
        String total = Double.toString(prezzo);
        return total;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }
}
