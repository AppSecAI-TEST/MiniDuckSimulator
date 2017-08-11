/**
 * 
 */
package com.miniducksim;

/**
 * @author Mano_Jayamaran
 *
 */
public class MiniDuckSimulatorMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		model.performQuack();
		
		Duck rubber = new RubberDuck();
		rubber.performFly();
		rubber.performQuack();
	}

}
