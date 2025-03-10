public class Panino {
    private int codice;
    private String nome;
    private String ingredienti;
    private double costo;
    
    public Panino(int codice, String nome, String ingredienti,double costo) {
        this.codice = codice;
        this.nome = nome;
        this.ingredienti = ingredienti;
        this.costo=costo;
    }

    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public String getIngredienti() {
        return ingredienti;
    }

    public double getCosto(){
        return costo;
    }
    
}
