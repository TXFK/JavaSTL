package JavaSTL;

/**
 * 这个类是一个抽象类，所以不能实例化。
 * <p>
 * 该类包含常用算法。这些算法已经被打包在不同的静态方法中。
 */
public abstract class Algorithms {
    /**
     * Binary search the index of <code>element</code> in the <code>elementList</code>.
     *
     * @param elementList The list of element. It must be sorted from small to big,
     *                    or the result will not be correct. The element in it must
     *                    implement <code>Comparable</code>.
     * @param element     The element which will be searched. It must implement
     *                    <code>Comparable</code>
     * @param <T>         The type of <code>element</code> and elements in
     *                    <code>elementList</code>
     * @return The index of the <code>element</code>.
     * If <code>elementList</code> doesn't contain <code>element</code>, return -1.
     */
    public static <T extends Comparable<T>> int binarySearch(T[] elementList, T element) {
        int start = 0;
        int end = elementList.length;
        int midIndex = (end - start) / 2;
        int lastStart = -1;
        int lastEnd = -1;
        while (start != end) {
            int resultOfCompare = elementList[midIndex].compareTo(element);
            if (resultOfCompare == 0) {
                return midIndex;
            } else if (resultOfCompare < 0) {
                start = midIndex;
            } else {
                end = midIndex;
            }
            if (lastStart == start && lastEnd == end) {
                return -1;
            }
            lastStart = start;
            lastEnd = end;
        }
        return start;
    }

    /**
     * Use insert sort to sort <code>elements</code>.
     *
     * @param elements The list of element(must implement <code>Comparable</code>)
     * @return Sorted <code>elements</code>
     */
    public static <T extends Comparable<T>> T[] insertSort(T[] elements) {
        NodeList<T> result = new NodeList<>();
        result.add(elements[0]);
        for (int i = 1; i < elements.length; i++) {
            for (int j = 0; j <= i; j++) {
                if(elements[j].compareTo(elements[i]) < 0){
                    result.add(j - 1, elements[i]);
                }
            }
        }
        return result.toArray();
    }
}
