package implementation;

public class SupermarketArray implements Supermarket {

    private final String [] items; // é necessário inicializar uma variável final no construtor
    private int lastIndex;

    public SupermarketArray(final int size) {
        items = new String[size];
        lastIndex = -1; // não possui itens ainda
    }

    @Override
    public void add(String item) {
        if (lastIndex == items.length - 1) {
            System.err.println("Supermarket list is full");
        } else {
            lastIndex++;
            items[lastIndex] = item;
        }

    }

    @Override
    public void print() {
        System.out.println("##################");
        if(lastIndex == -1) {
            System.out.println("Empty list");
        }
        for (int i = 0; i <= lastIndex; i++) {
            System.out.println(i + "-" + items[i]);
        }
        System.out.println("##################");
    }

    @Override
    public void delete(final int index) {
        if(index >= 0 && index <= lastIndex) {
            shift(index);
            lastIndex--;
        } else {
            System.err.println("Invalid index");
        }
    }

    private void shift(int index) {
        for(int i = index; i < lastIndex; i++) {
            items[i] = items[i+1];
        }
    }
}
