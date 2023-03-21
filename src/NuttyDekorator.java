public class NuttyDekorator extends CakeDekorator{

    public NuttyDekorator(Cake specialCake) {
        super(specialCake);
    }
    public String makeCake() {
        return specialCake.makeCake() + addNuts();
    }

    private String addNuts() {
        return " + crunchy nuts";
    }
}
