public abstract class CakeDekorator implements Cake{

   protected Cake specialCake;

   public CakeDekorator(Cake specialCake) {
      this.specialCake = specialCake;
   }

   public String makeCake() {
      return specialCake.makeCake();
   }

}
