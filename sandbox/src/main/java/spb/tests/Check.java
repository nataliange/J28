package spb.tests;

public class Check {

  public static void main(String[] args) {

    Point p = new Point(2, 4, 8, 10);


    //3
		/*System.out.println("расстояние " + "=" + distance(p));*/

    //№4
    System.out.println("расстояние " + "=" + p.distance());
  }
  //№3
/*		public static double distance(Point p) {
	return Math.sqrt( Math.pow(p.x2-p.x1, 2) + Math.pow(p.y2-p.y1, 2) );
}*/

}
