package patterns.structural.adapter.one;

public class CardReaderAdapter implements USB {
	
	private AbstractMemoryCard abstractMemoryCard;
	
	public CardReaderAdapter(AbstractMemoryCard abstractMemoryCard) {
		this.abstractMemoryCard = abstractMemoryCard;
	}
	
	@Override
	public void connectUSB() {
		this.abstractMemoryCard.insert();
		this.abstractMemoryCard.copyDataToComputer();
	}
	
}
