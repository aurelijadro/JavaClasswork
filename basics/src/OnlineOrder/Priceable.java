package OnlineOrder;

public interface Priceable extends Orderable, Deliverable { // bus galima realizuoti abiejų interface'ų metodus
	default double calculatePrice() {
		return calculateOrderPrice()+calculateDeliveryPrice();
	}
}
