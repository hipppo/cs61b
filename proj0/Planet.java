import java.lang.Math;

public class Planet {
	double xxPos, yyPos, xxVel, yyVel, mass;
	String imgFileName;

	public Planet (double xP, double yP, double xV, double yV, double m, String img){
		this.xxPos = xP;
		this.yyPos = yP;
		this.xxVel = xV;
		this.yyVel = yV;
		this.mass = m;
		this.imgFileName = img;
	}

	public Planet (Planet p){
		this.xxPos = p.xxPos;
		this.yyPos = p.yyPos;
		this.xxVel = p.xxVel;
		this.yyVel = p.yyVel;
		this.mass = p.mass;
		this.imgFileName = p.imgFileName;
	}

	public static double calcDistance (Planet p){
		double distance;
		double distance_X = Math.abs(this.xxPos - p.xxPos);
		double distance_Y = Math.abs(this.yyPos - p.yyPos);
		distance = Math.sqrt(Math.pow(distance_X, 2) + Math.pow(distance_Y, 2));
		return distance; 
	}

	public double calcForceExertedBy (Planet p){
		double G = 6.67E-11;
		double Force;
		double distance = this.calcDistance(p);

		Force = G * this.mass * p.mass / Math.pow(distance, 2);

		return Force;
	}

	public double calcForceExertedByX (Planet p){
		double Force = this.calcForceExertedBy(p);
		double distance = this.calcDistance(p);
		double distance_X = Math.abs(this.xxPos - p.xxPos);

		double Force_X = Force * distance_X / distance;

		return Force_X;
	}

	public double calcForceExertedByY (Planet p){
		double Force = this.calcForceExertedBy(p);
		double distance = this.calcDistance(p);
		double distance_Y = Math.abs(this.yyPos - p.yyPos);

		double Force_Y = Force * distance_Y / distance;

		return Force_Y;
	}

	public double calcNetForceExertedByX (Planet[] planets){
		double Force_X = 0;

		for (int i = 0; i < planets.length; i++){
			if (this.equals(planets[i]))
				i++;
			double Force = this.calcForceExertedBy(planets[i]);
			double distance = this.calcDistance(planets[i]);
			double distance_X = Math.abs(this.xxPos - planets[i].xxPos);

			Force_X += Force * distance_X / distance;
		}
		return Force_X;
	}

	public double calcNetForceExertedByY (Planet[] planets){
		double Force_Y = 0;

		for (int i = 0; i < planets.length; i++){
			if (this.equals(planets[i]))
				i++;
			double Force = this.calcForceExertedBy(planets[i]);
			double distance = this.calcDistance(planets[i]);
			double distance_Y = Math.abs(this.yyPos - planets[i].yyPos);

			Force_Y += Force * distance_Y / distance;
		}
		return Force_Y;
	}
	
	public static void update(double dt, double fX, double fY){
		double t_XP, t_YP, t_xV, t_yV;

		t_xV = this.xxVel + dt * fX/this.mass;
		t_yV = this.yyVel + dt * fY/this.mass;
		t_XP = dt * t_xV;
		t_YP = dt * t_yV;

		this.xxPos += t_XP;
		this.yyPos += t_YP;
		this.xxVel = t_xV;
		this.yyVel = t_yV;
	}
}
