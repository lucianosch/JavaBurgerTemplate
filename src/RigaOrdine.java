public class RigaOrdine {
    private int codice;
    private int qta;
    
    public RigaOrdine(int codice, int qta) {
        this.codice = codice;
        this.qta = qta;
    }

    public int getCodice() {
        return codice;
    }

    public int getQta() {
        return qta;
    }

    public void aggiungi() {
        this.qta++;
    }
}
