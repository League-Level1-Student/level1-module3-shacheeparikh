import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
	public static final int ahead = 2;
	public static final int northeast = 4;

	public static void main(String[] args) {

		World w = new World();
		w.show();

		Location l = new Location(ahead, northeast);
		Random r = new Random();
		int a = r.nextInt(10);
		int c = r.nextInt(10);

		Location l1 = new Location(a, c);
		Bug b = new Bug();
		//Bug b1 = new Bug(Color.BLUE);

	

		
	
		Flower f = new Flower();

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == j) {
					Location lo = new Location(i, j);
					w.add(lo, b);
				}
			}
		}
		
		int j=9;
		for (int i = 0; i < 10; i++) {
			
				
					Location lo = new Location(i, j);
					w.add(lo, b);
					j--;
				}
			
		}
		
		
		
		
	}


