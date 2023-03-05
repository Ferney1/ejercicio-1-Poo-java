public class Gitarra  extends Intrumentos{
    int cuerdas;

    public Gitarra() {
    }

    public Gitarra(String tocar, String sonidos, int cuerdas) {
        super(tocar, sonidos);
        this.cuerdas = cuerdas;
    }

    public void cuantasCuedasTienes(){
        System.out.println(5);
    }

    public  void cancionesTocadas(){
        System.out.println("Se puede tocar cual quier cancion ");
    }
}
