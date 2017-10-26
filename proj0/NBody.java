public class NBody {

	public static double readRadius(String FileName){
		double radius = 0;
		In in = new In(FileName);
		in.readInt();
		return in.readDouble();
	}

	public static Planet[] readPlanets(String FileName){
		In in = new In(FileName);
		int num_planets = in.readInt();
		in.readDouble();
		Planet[] Planets = new Planet[num_planets];
		for(int i = 0; i < num_planets; i++){
			Planets[i] = new Planet(in.readDouble(), in.readDouble(), in.readDouble(), in.readDouble(), in.readDouble(), in.readString());
		}
		return Planets;
	}

	public static void main(String[] args){
		
		double T = Double.parseDouble(args[0]);
		double dt = Double.parseDouble(args[1]);
		String filename = args[2];

		Planet[] Planets = readPlanets(filename);
		double radius = readRadius(filename);

		StdAudio.play("audio/2001.mid");
		StdDraw.setScale(-radius, radius);
		StdDraw.clear();

		for(double time = 0; time < T; time += dt){
			StdDraw.picture(0, 0, "images/starfield.jpg");

			double[] xForces = new double[Planets.length];
			double[] yForces = new double[Planets.length];

			for (int i = 0; i < Planets.length; ++i){
				xForces[i] = Planets[i].calcNetForceExertedByX(Planets);
				yForces[i] = Planets[i].calcNetForceExertedByY(Planets);
				Planets[i].update(dt, xForces[i], yForces[i]);
				Planets[i].draw();
			}
		
			StdDraw.show(10);
		
		}
	}
}
