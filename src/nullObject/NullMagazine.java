package nullObject;

public class NullMagazine extends AbstractMagazine{

	@Override
	public String getTitle() {
		return "This magazine was not found!!!";
	}

	@Override
	public int getPages() {
		return 0;
	}

}
