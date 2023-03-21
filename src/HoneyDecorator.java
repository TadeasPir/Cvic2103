public class HoneyDecorator extends CakeDekorator{

    public HoneyDecorator(Cake specialCake) {
        super(specialCake);
    }

    public String makeCake() {
        return specialCake.makeCake() + addHoney();
    }

    private String addHoney() {
        return " + sweet honey";
    }
}
