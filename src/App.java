public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Model myModel = new Model("panini.txt");
        View myView = new View(myModel.getN());

        new Controller(myView,myModel);
    }
}
