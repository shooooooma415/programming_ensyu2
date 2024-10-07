public class Address {

    Cell cellData;
    AddressData data;
    private Cell header;
    private int size;

    public Address() {
        header = null;// 先頭の要素 中身はない
        size = 0;
    }


    public void insertFirst(AddressData d) {
        Cell firstCell = new Cell(d);
        firstCell.next = header; // firstCellが指し示すのはnull(headerに入っていたもの)
        header = firstCell; // headerが指し示すものはfirstCell
        size = size + 1;
    }

    public AddressData deleteFirst() {
        if (header == null) {
            System.out.println("データがありません");
            return null;
        }
        Cell delateCell = header; // 1 削除対象を delateCell に保存
        header = header.next; // 2 削除:headerはheaderの次
        size = size - 1;
        return (delateCell.data); // 3 削除対象のデータを返す
    }

    public void displayList() {
        Cell current = header; // リストの先頭からスタート
        while (current != null) { // リストの末尾まで
            current.data.print();
            current = current.next; // 次のリンクへ進む }
        }
    }

    public AddressData getAddressData(int position) {
        // position がリストの範囲内かどうかを判定(sizeを利用)
        if ((position <= 0) || (position > size)) {
            System.out.println("その位置には要素がありません");
            return null;
        }

        Cell current = header; // current がリストの先頭を指す
        // position まで要素を順番に移動する
        for (int count = 1; count < position; count++) {
            current = current.next;
        }
        return current.data;
    }

    public boolean insert(AddressData d, int i) {
        Cell insertCell = new Cell(d);
        if (i < 1 || i > size + 1) { // 要素数よりも大きいところに差し込みはできない．また，自然数ではない時も差し込み不可能
            return false;
        }
        if (i == 1) {// iが1の時はそのまま先頭に入るだけなのでinsertFirstを使う
            insertFirst(d);
            return true;
        }
        Cell current = header; // current がリストの先頭を指す
        for (int count = 1; count < i - 1; count++) {
            current = current.next;
        }
        insertCell.next = current.next; // 差し込んだ場合，insertCellの次は元々あったものが入る
        current.next = insertCell; // 言わずもがな，currentの次は差し込んだinsertCell
        size = size + 1;
        return true;
    }

    public AddressData delete(int i) {
        if (i < 1 || i > size) {
            return null;
        }
        if (i == 1) {
            return deleteFirst();
        }
        Cell current = header; // current がリストの先頭を指す
        for (int count = 1; count < i - 1; count++) {
            current = current.next;
        }
        Cell deleteData = current.next;
        current.next = current.next.next;
        size = size - 1;
        return deleteData.data;
    }
}
