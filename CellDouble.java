public class CellDouble {
    CellDouble next;
    CellDouble prev;
    AddressData data;

    public CellDouble(AddressData d) {
        this.data = d;
        this.next = null;
        this.prev = null;
    }
}
