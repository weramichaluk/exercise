package pl.knab.cars;

/**
 * 
 *
 * @since 2016-03-07, 23:49:41
 * @author Kacper Roszczyna
 */
public class TerrainCar extends Car {

   /* public TerrainCar(String nazwa, int cena) {
		super(nazwa, cena);
		// TODO Auto-generated constructor stub
	}*/
	

	@Override
    public void accelerate() {
        speed += 5;
       // System.out.println("Terrain Car speed: "+speed);
    }

}