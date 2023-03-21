public class CaramelDekorator extends CakeDekorator{


    public CaramelDekorator(Cake specialCake) {
        super(specialCake);
    }
    public String makeCake() {
        return specialCake.makeCake() + addCaramel();
    }

    public String addCaramel(){
        return " + Caramel";
    }
}
