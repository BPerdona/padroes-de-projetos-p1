package nullObject;

public class MagazineDAO {
	
	public static final String[] titles = {"OutSide", "Veja", "Tititi", "Ciencia Hoje", "Science", "Cell", "Nature"};
	public static final int[] pages = {32, 14, 31, 51, 42, 23, 29};
	
	public static AbstractMagazine getCustomer(String title) {
		
		for(int i=0; i<titles.length; i++) {
			if(titles[i].equalsIgnoreCase(title)) {
				return new RealMagazine(titles[i], pages[i]);
			}
		}
		
		return new NullMagazine();
	}
}
