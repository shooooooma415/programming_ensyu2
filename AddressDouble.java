public class AddressDouble {

    CellDouble cellData;
    AddressData data;
    private CellDouble head;
    private CellDouble tail;
    private int size;

    public AddressDouble() { // リストの頭を作成
        head = null;
        tail = null;
        size = 0;
    }

    public void insertFirst(AddressData d) {
        CellDouble firstCellDouble = new CellDouble(d);
        firstCellDouble.next = head; // firstCellが指し示すのはnull(headに入っていたもの)
        head = firstCellDouble; // headが指し示すものはfirstCell
        size = size + 1;
    }

    public AddressData deleteFirst() {
        if (head == null) {
            System.out.println("データがありません");
            return null;
        }
        CellDouble delateCell = head; // 1 削除対象を p に保存
        head = head.next; // 2 削除:headはheadの次
        size = size - 1;
        return delateCell.data; // 3 削除対象のデータを返す
    }

    public void insertLast(AddressData d) {
        CellDouble lastCellDouble = new CellDouble(d);
        if (head == null) {
            insertFirst(d);
        }
        CellDouble current = head;
        while (current.next != null) {
            current = current.next;
        }
        // 新しいセルを末尾に挿入し、リストの末尾を更新する
        current.next = lastCellDouble;
        lastCellDouble.prev = current;
        size = size + 1;
    }

    public void deleteLast(AddressData d) {
        if (head == null) {
            System.out.println("データがありません");
            return;
        }
        if (head.next == null) {
            // リストに要素が1つだけの場合、先頭の要素を削除する
            head = null;
        }
        CellDouble current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        // 末尾のセルを削除し、リストの末尾を更新する
        current.next = null;
        size = size - 1;
    }
}
