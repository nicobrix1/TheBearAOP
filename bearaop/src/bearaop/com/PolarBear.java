package bearaop.com;

public class PolarBear extends BearServiceLive{
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("   Polar Bear eats cold food."  
						 + "\n\tEats:"
						 + "\n\t  *Penguins");
	}
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("  Polar Bear sleeps in cold bed.");
		System.out.println(" Go to sleep Polar Bear.");
	}
	@Override
	public void bath() {
		// TODO Auto-generated method stub
		System.out.println("  Polar Bear bathes in cold water.");
		System.out.println(" Polar Bear is a Bear.");
	}

}
