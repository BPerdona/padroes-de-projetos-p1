package nullObject;

public class RealMagazine extends AbstractMagazine{

	public RealMagazine(String title, int pages) {
		super();
		this.title = title;
		this.pages = pages;
	}
	
	@Override
	public String getTitle() {
		return this.title;
	}

	@Override
	public int getPages() {
		return this.pages;
	}

}
