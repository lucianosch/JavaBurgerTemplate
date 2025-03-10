import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;

public class Model {
    private ArrayList<Panino> panini;
    private ArrayList<RigaOrdine> ordine;

    Model(String nomeFile) throws FileNotFoundException{
        
    }

    public int getN(){
        return 0;
    }

    public Collection<Integer> getCodes(){
        return null;
    }
    
    public void aggiungiPanino(int codice){
       
    }

    public void resetOrdine(){

    }

    public String getIngredienti(int codice){
        String retVal = "";
        return retVal;
    }

    public String getNome(int codice){
        String retVal = "";
        return retVal;
    }

    public String getOrdine(){
        String retVal = "";
        return retVal;
    }

    public int getCodice(String nome){
        return 0;
    }
}
