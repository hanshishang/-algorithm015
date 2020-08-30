学习笔记
 # 栈和队列<br>
## Statck:先入后出；添加、删除皆为o(1)<br>
* Queue:先入先出；添加、删除皆为o(1)<br>
  * Queue 继承 Collection其中包含：
    * boolean add:如果可以立即将指定的元素插入此队列，而不会违反容量限制，则true成功后返回 ，IllegalStateException 如果当前没有可用空间，则抛出。<br>
    * E remove():检索并删除此队列的头。
    * E element():检索但不删除此队列的头。
    * boolean offer:如果可以在不违反容量限制的情况下立即将指定的元素插入此队列。
    * E poll():检索并删除此队列的头，null如果此队列为空，则返回。
    * E peek():检索但不删除此队列的头部，null如果此队列为空，则返回。

## Deque：Statck与Queue结合体<br>
  * 简单理解：两端可以进出的Queue Deque-double ended queue<br>
  * 插入和删除都是o(1)操作<br>
  
## Priority Queue（优先队列）<br>
   * 插入操作：O(1)<br>
   * 取出操作：O(log N) 按照元素的优先级取出<br>
   * 底层具体实现的数据结构较为多样和复杂 ：heap、bst、treap<br>
     * boolean	add​(E e):将指定的元素插入此优先级队列。<br>
     * void	clear()	:从此优先级队列中删除所有元素。<br>
     * Comparator<? super E> comparator():返回用于对队列中的元素进行排序的比较器，或者返回null根据该队列的自然顺序对队列进行排序的比较器。<br>
     * boolean	contains​(Object o):返回true此队列是否包含指定的元素。<br>
     * Iterator<E>	iterator():返回对该队列中的元素进行迭代的迭代器。<br>
     * boolean	offer​(E e):将指定的元素插入此优先级队列。<br>
     * boolean	remove​(Object o):从该队列中删除指定元素的单个实例（如果存在）。<br>
     * Spliterator<E>	spliterator():在此队列中的元素上创建后期绑定 和故障 Spliterator转移。<br>
     * Object[]	toArray():返回一个包含此队列中所有元素的数组。<br>
     * <T> T[]	toArray​(T[] a):返回一个包含此队列中所有元素的数组；返回数组的运行时类型是指定数组的运行时类型。<br>