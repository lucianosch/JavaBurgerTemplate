public class Controller {
    private Model modello;
    private View vista;

    public Controller(View vista, Model modello) {
        this.modello = modello;
        this.vista = vista;
        setView();
        assegnaGestori();
    }

    private void setView(){
       //Per ogni pulsante dell'array devo impostare l'etichetta del pulsante
       //con il nome del panino
    }
    
    private void assegnaGestori(){

    }
}
