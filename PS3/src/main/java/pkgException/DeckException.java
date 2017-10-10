package pkgException;


public class DeckException<Deck>   {

	private Deck d;

	public DeckException(Deck d) {
		super();
		this.d = d;
	}

	protected Deck getD() {
		return d;
	}
	
	
}
