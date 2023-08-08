
public class TheaterRunner {
	public static void main(String[] args) {
		Theater theater = new Theater();
		theater.display();

		Theater theater1 = new Theater("X-man","BTM-12th-cross","06-09-1999",TheaterClasses.AC_ROOMS,TheaterTypes.GN);
		theater1.display();



		Theater theater2 = new Theater("X-man","BTM-12th-cross");
		theater2.display();

		Theater theater3 = new Theater();
		theater3.setClasses(TheaterClasses.BALCONE);
		theater3.display();
		
		Theater theater4 = new Theater();
		theater4.setType(TheaterTypes.LD);
		theater4.display();

	}
}
