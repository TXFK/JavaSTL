package JavaSTL;

public interface List<T> {
    /**
     * 添加元素到末尾。
     *
     * @param element 添加的元素
     */
    void add(T element);

    /**
     * 添加元素到指定索引之后。
     *
     * @param element 添加的元素
     * @param index   指定索引
     */
    void add(T element, int index);

    /**
     * 按顺序添加指定<code>List</code>中的元素
     * @param list  指定<code>List</code>
     */
    void add(List<? extends T> list);

    /**
     * 移除末尾元素
     */
    void remove();

    /**
     * 当元素存在时删除它。如果有将被删除的两个相同的元素，则删除第一个出现的。
     *
     * @param element 被移除的元素
     */
    void remove(T element);

    /**
     * 移除指定<code>List</code>和本<code>List</code>中都包含的元素
     * @param list  指定<code>List</code>
     */
    void remove(List<? extends T> list);

    /**
     * 移除该索引上的元素
     *
     * @param index 被移除元素的索引
     */
    void removeByIndex(int index);

    /**
     * 将该索引位置的元素替换成指定元素
     *
     * @param index   被替换元素的索引位置
     * @param element 替换原元素的元素
     */
    void set(int index, T element);

    /**
     * 将 <code>start<code> 和 <code>end<code> 之间的元素替换为 <code>elements<code> 中的元素
     * @param start     被替换元素的起始索引（包括自身）
     * @param end       被替换元素的结束索引（不包括自身）
     * @param elements  将被填充的元素的数组
     */
    void set(int start, int end, T[] elements);

    /**
     * 返回指定索引下的元素
     *
     * @param index 指定索引
     * @return 该索引下的元素
     */
    T get(int index);

    /**
     * 返回该元素第一次出现的索引位置，如果元素不存在，返回-1。
     *
     * @param element 该元素
     * @return 该元素第一次出现的索引位置，如果元素不存在，返回-1。
     */
    int indexOf(T element);

    /**
     * 返回该元素最后一次出现的索引位置，如果元素不存在，返回-1。
     *
     * @param element 该元素
     * @return 该元素最后一次出现的索引位置，如果元素不存在，返回-1。
     */
    int lastIndexOf(T element);

    /**
     * 返回 <code>list<code> 的大小
     * @return  <code>list<code>的大小
     */
    int size();

}
