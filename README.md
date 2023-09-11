# study
study

#### finalize
1. 对象被回收时，系统自动调用该对象的finalize方法，

####编译类型vs运行类型
1. 编译时类型由声明该变量时使用的类型决定。编译时引用变量只能调用其编译类型所具有方法。因此p只能调用test，无法调用test2
```java

```

![img/img.png](img.png)
2. 运行时类型由实际赋给该变量的对象决定。
   所以p和s的运行类型都是student,test()运行结果都是student里面的方法
   运行结果是：

#### 面向对象
##### 三大特征
8.10  方法重载和重写
 1. 重载发生在本类，方法名必须一样，形参类型，个数或顺序至少有一个不同
 2. 重写发生在父子类，方法名相同，形参相同，子类重写的方法返回类型和父类的返回类型一致或是其子类，不能缩小父类的访问范围。
8.11 多态
 1. 方法或对象具有多种形态。是面向对象的第三大特征，多态是建立在封装和继承基础之上的。

10.3 代码块 codeblock
1. static代码块也叫静态代码块
2. ``类什么时候被加载``
  - 创建对象实例时（new）。
  - 创建子类对象实例，父类也会被加载。
  - 使用类的静态成员变量时（静态属性，静态方法）。
3. 普通的代码块，在创建对象时，会被隐式的调用。
4. 创建一个对象时，在一个类调用顺序是：
   1. 调用静态代码块和静态属性初始化（两者调用的优先级一样，如果有多个，则按照定义顺序调用）.
   2. 调用普通代码块和普通属性的初始化（同上）。
   3. 调用构造方法.
5. 构造器的最前面隐含了super()和调用普通代码
6. 创建子类对象时（继承关系）,他们的静态代码块，静态属性，普通代码快，普通属性初始化顺序：
   1. 父类的静态代码块和静态属性.
   2. 子类的静态代码块和静态属性。
   3. 父类的普通代码块和普通属性初始化。
   4. 父类的构造方法。
   5. 子类的普通代码快和普通属性初始化。
   6. 子类的构造方法。

10.4 设计模式 design_mode
1. 单例（懒汉式和饿汉式）
   1. 区别：
      1. 饿汉式一旦加载，就把单例实例化，保证getInstance的时候，单例是已经存在的（类加载时就创建实例）；可用于多线程，不存在线程安全问题；存在资源浪费。
      2. 懒汉式，只有当调用getInstance的时候才去初始化这个实例（使用时才创建）；本身是非线程安全的(双检锁解决并发问题)。
      3. 饿汉式在类创建的同时实例化一个静态对象出来，无论以后是否使用该单例，都会占用一定的内存，但相应地，由于其资源已初始化，第一次调用的速度也会更快。
懒汉式，会延迟加载，在第一次使用本单例时才会出现实例对象，第一次调用时要做初始化，如果要做的工作比较多，性能会有些延迟，以后就像饿汉式一样。

10.6 抽象类

14.4 List接口
1. 特征
   ![img_3.png](img_3.png)
2. 常用方法 ListMethod
   1. void add(int index,Object ele):在index位置插入元素ele
   2. boolean addAll()
   3. Object get(int index):获取
   4. int indexOf(Object obj)：返回obj在集合首次出现的位置
   5. int lastIndexOf(Object obj)
   6. Object remove(int index)
   7. Object set(int index,Object ele):替换
   8. List subList(int fromIndex,int toIndex):返回从fromIndex到toIndex 之间的子集合
14.5 ArrayList类
1. 注意：
   1. 可以加入多个null，可以重复
   2. 基本等同于Vector，但ArrayList线程不安全，(没有synchronized),多线程不适用
   3. 底层由**数组**实现数据存储的。**ArrauListSource**
      1. 底层维护了Object类型的数组elementData. transient（表示该属性不会序列化） Object[] elementData.
      2. 当创建对象时，如果使用无参构造器，初始elementData的容量为0，第一次添加需要扩容，扩容elementData为**10**，再次扩容按**1.5倍**
      3. 当添加元素时，先判断是否需要扩容，调用grow方法，否则直接添加元素到合适位置。
         ![img_5.png](img_5.png)
         ![img_6.png](img_6.png)
         ![img_4.png](img_4.png)
14.6 Vector
1. 特点
   1. 实现了List接口
   2. 底层也是对象数组protected Object[] elementData
   3. 扩容也是从10开始，之后按**2倍扩容**
   3. Vector线程同步的，即线程安全，操作方法带有synchronized
   4. 开发需要线程同步，用Vector。否则单线程用ArrayList效率高。
14.7 LinkedList
1. LinkedList实现了双向链表和双端队列特点。
2. 可以添加任意元素（可重复），多个null
3. 线程不安全，没有实现线程同步。
4. 底层机制
![img_7.png](img_7.png)
![img_8.png](img_8.png)

14.9 Set接口
1. 无序，没有索引
2. 不允许重复元素，最多一个null
14.10 Set接口实现类-**HashSet**
1. 实现了Set接口
2. 实际上是HashMap
3. 可以存放一个null
4. 不保证元素是有序的，取决于hash后，再确定索引的结果
5. 不能有重复的元素
6. 具体add()方法看代码HashSet01
7. == 底层 ==
   ![img_1.png](img_1.png)
8. == 扩容机制 == 初始16，到达加载因子0.75的容量时候扩容
   ![img_2.png](img_2.png)
9.

14.12.3 map接口遍历方法
![img.png](img.png)
具体参考MapFor类。
14.12Map接口
1. Map接口实现类的特点
   1. Map与Collection，用于保存具有映射关系的数据。
      2. Map中的key和value可以是任何引用类型的数据，会封装到**HashMap$Node**对象中存储数据
      3. Map的key不能重复，value可以重复，key和value可以有null
      4. 如果添加相同的key，则会覆盖原来的key-value，等同于修改。（value会替换）
      5. 与HashSet一样，不保证映射的顺序，因为底层是以hash表的方式存储。HashMap的底层是数据+链表+红黑树
      4. 没有实现同步，线程不安全。
      5. 常用String类作为Map的key
      6. 可通过key找value，一一对应。
2. Map接口常用方法
   1. put 添加
   2. remove 根据键删除映射关系
   3. get 根据键获取值
   4. size 获取元素个数
   5. isEmpty 判断个数是否为0
   6. clear 清除
   7. containsKey 查找键是否存在
3. 遍历
```java
//1.使用keySet
Map map = new HashMap();
Set keySet = map.keySet();
//增强for或迭代器遍历keySet,value=map.get(key)
//2.使用entrySet
Set entrySet = map.entrySet();
//遍历，注意entry为Map.Entry类。
```
4. 实现类HashMap底层机制
   1. HashMap底层维护了Node类型的数组table，默认为null
   2. 当创建对象时，将加载因子(loadfactor)初始化为0.75
   3. 当添加key-value时，通过key的哈希值得到在table的索引，判断该索引处是否有元素，如果没有元素则直接添加。
      如果相等则替换原来的vlue；如果不相等则需要判断是树结构还是链表结构，做出相应处理。如果容量不够则扩容。
   4. 第1次添加，则需要扩容table容量为16，临界值就是12（16×0.75）。
   5. 之后扩容则需要扩容table容量的2倍（32），临界值（threshold）也为原来的2倍（24），以此类推
   6. 在java8中，如果一条链表的元素个数超过TREEIFY_THRESHOLD（默认8）,并且table的大小>=MIN_TREEIFY_CAPACITY(64),
      则进行树化（红黑树）。