public class Piano extends Intrumentos{

    int teclas;

    public Piano() {
    }

    public Piano(String tocar, String sonidos, int teclas) {
        super(tocar, sonidos);
        this.teclas = teclas;
    }

    public void melodias(){
        System.out.println(" las mañanitas");
    }

    public void notas(){
        System.out.println("Do, Re, Mi, Fa");
    }
}
