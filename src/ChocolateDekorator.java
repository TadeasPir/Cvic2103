public class ChocolateDekorator extends CakeDekorator{
    public ChocolateDekorator(Cake specialCake) {
        super(specialCake);
    }

    public String makeCake() {
        return specialCake.makeCake() + addChocolate();
    }
    public String addChocolate(){
        return " + black chocolate";
    }
}
