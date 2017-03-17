package tw.org.iii;

public class Physic {
	double g = 9.8;
	double mass;
	double length;
	double temperature;
	double time;
	
	double velocity=length/time;
	private double volume = getVolume(length,length,length);
	private double area = getArea(length,length);
	
	double angle;
	
	
	private double density = mass/volume;
	
	static double getVolume(double l, double w, double h){
		return l* w* h;
	};
	
	static double getArea(double l, double w){
		return l*w;
	};
}
