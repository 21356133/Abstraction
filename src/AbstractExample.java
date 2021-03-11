
 abstract class Car {

    String model;
    String color;
    int maxSpeed;

  Car(String model,String color,int maxSpeed)
  {
           this.model=model;
           this.color=color;
          this.maxSpeed=maxSpeed;
   }

   public void gas() {
       System.out.println("Gas!");
   }

   public abstract void brake();

    
}


 class Bmw extends Car {

       Bmw()
      {
        super("sedan","Blue",150);
        
        }

   @Override
   public void brake() {
       System.out.println("Bmw is slowing down!");
   }

}


public class AbstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bmw bmw = new Bmw();
	       bmw.gas();
	       bmw.brake();

	}

}
