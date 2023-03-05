public class Tambor extends Intrumentos{

    String sonoro;

    public Tambor() {
    }

    public Tambor(String tocar, String sonidos, String sonoro) {
        super(tocar, sonidos);
        this.sonoro = sonoro;
    }

    public  void Funcion(){
        System.out.println("Zonar al ritmo de la melodia y causa eforia");
    }
}
