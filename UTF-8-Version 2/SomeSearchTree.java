public class SomeSearchTree {
    private String[] heapArray;
    private int currentSize;

    public SomeSearchTree(int maxSize) {
        heapArray = new String[maxSize];
        currentSize = 0;
    }

    public void insert(String value) {
        heapArray[currentSize] = value;
        trickleUp(currentSize++);
    }

    public String deleteMin() {
        String root = heapArray[0];
        heapArray[0] = heapArray[--currentSize];
        trickleDown(0);
        return root;
    }

    private void trickleUp(int index) {
        int parent = (index - 1) / 2;
        String bottom = heapArray[index];
        while (index > 0 && heapArray[parent].compareTo(bottom) > 0) {
            heapArray[index] = heapArray[parent];
            index = parent;
            parent = (parent - 1) / 2;
        }
        heapArray[index] = bottom;
    }

    private void trickleDown(int index) {
        int largerChild;
        String top = heapArray[index];
        while (index < currentSize / 2) {
            int leftChild = 2 * index + 1;
            int rightChild = leftChild + 1;
            if (rightChild < currentSize && heapArray[leftChild].compareTo(heapArray[rightChild]) > 0) {
                largerChild = rightChild;
            } else {
                largerChild = leftChild;
            }
            if (top.compareTo(heapArray[largerChild]) <= 0) {
                break;
            }
            heapArray[index] = heapArray[largerChild];
            index = largerChild;
        }
        heapArray[index] = top;
    }
}
