package one.show.common.localcache;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * A common set of {@link Weigher} implementations.
 *
 * @author ben.manes@gmail.com (Ben Manes)
 * @see <tt>http://code.google.com/p/concurrentlinkedhashmap/</tt>
 */
@SuppressWarnings("unchecked")
public final class Weighers {

  private Weighers() {
    throw new AssertionError();
  }

  /**
   * A weigher where a value has a weight of <tt>1</tt>. A map bounded with
   * this weigher will evict when the number of key-value pairs exceeds the
   * capacity.
   *
   * @return A weigher where a value takes one unit of capacity.
   */
  public static <V> Weigher<V> singleton() {
    return (Weigher<V>) SingletonWeigher.INSTANCE;
  }

  /**
   * A weigher where the value is a byte array and its weight is the number of
   * bytes. A map bounded with this weigher will evict when the number of bytes
   * exceeds the capacity rather than the number of key-value pairs in the map.
   * This allows for restricting the capacity based on the memory-consumption
   * and is primarily for usage by dedicated caching servers that hold the
   * serialized data.
   *
   * @return A weigher where each byte takes one unit of capacity.
   */
  public static Weigher<byte[]> byteArray() {
    return ByteArrayWeigher.INSTANCE;
  }

  /**
   * A weigher where the value is a {@link Iterable} and its weight is the
   * number of elements. This weigher only should be used when the alternative
   * {@link #collection()} weigher cannot be, as evaluation takes O(n) time. A
   * map bounded with this weigher will evict when the total number of elements
   * exceeds the capacity rather than the number of key-value pairs in the map.
   *
   * @return A weigher where each element takes one unit of capacity.
   */
  public static <E> Weigher<Iterable<E>> iterable() {
    Weigher<?> weigher = IterableWeigher.INSTANCE;
    return (Weigher<Iterable<E>>) weigher;
  }

  /**
   * A weigher where the value is a {@link Collection} and its weight is the
   * number of elements. A map bounded with this weigher will evict when the
   * total number of elements exceeds the capacity rather than the number of
   * key-value pairs in the map.
   *
   * @return A weigher where each element takes one unit of capacity.
   */
  public static <E> Weigher<Collection<E>> collection() {
    Weigher<?> weigher = CollectionWeigher.INSTANCE;
    return (Weigher<Collection<E>>) weigher;
  }

  /**
   * A weigher where the value is a {@link List} and its weight is the number
   * of elements. A map bounded with this weigher will evict when the total
   * number of elements exceeds the capacity rather than the number of
   * key-value pairs in the map.
   *
   * @return A weigher where each element takes one unit of capacity.
   */
  public static <E> Weigher<List<E>> list() {
    Weigher<?> weigher = ListWeigher.INSTANCE;
    return (Weigher<List<E>>) weigher;
  }

  /**
   * A weigher where the value is a {@link Set} and its weight is the number
   * of elements. A map bounded with this weigher will evict when the total
   * number of elements exceeds the capacity rather than the number of
   * key-value pairs in the map.
   *
   * @return A weigher where each element takes one unit of capacity.
   */
  public static <E> Weigher<Set<E>> set() {
    Weigher<?> weigher = SetWeigher.INSTANCE;
    return (Weigher<Set<E>>) weigher;
  }

  /**
   * A weigher where the value is a {@link Map} and its weight is the number of
   * entries. A map bounded with this weigher will evict when the total number of
   * entries across all values exceeds the capacity rather than the number of
   * key-value pairs in the map.
   *
   * @return A weigher where each entry takes one unit of capacity.
   */
  public static <A, B> Weigher<Map<A, B>> map() {
    Weigher<?> weigher = MapWeigher.INSTANCE;
    return (Weigher<Map<A, B>>) weigher;
  }

  @SuppressWarnings("rawtypes")
private enum SingletonWeigher implements Weigher {
    INSTANCE;

    @Override
    public int weightOf(Object value) {
      return 1;
    }
  }

  private enum ByteArrayWeigher implements Weigher<byte[]> {
    INSTANCE;

    @Override
    public int weightOf(byte[] value) {
      return value.length;
    }
  }

  @SuppressWarnings("rawtypes")
private enum IterableWeigher implements Weigher<Iterable> {
    INSTANCE;

    @Override
    public int weightOf(Iterable values) {
      if (values instanceof Collection) {
        return ((Collection) values).size();
      }
      int size = 0;
      for (@SuppressWarnings("unused") Object value : values) {
        size++;
      }
      return size;
    }
  }

  @SuppressWarnings("rawtypes")
private enum CollectionWeigher implements Weigher<Collection> {
    INSTANCE;

    @Override
    public int weightOf(Collection values) {
      return values.size();
    }
  }

  @SuppressWarnings("rawtypes")
private enum ListWeigher implements Weigher<List> {
    INSTANCE;

    @Override
    public int weightOf(List values) {
      return values.size();
    }
  }

  @SuppressWarnings("rawtypes")
private enum SetWeigher implements Weigher<Set> {
    INSTANCE;

    @Override
    public int weightOf(Set values) {
      return values.size();
    }
  }

  @SuppressWarnings("rawtypes")
private enum MapWeigher implements Weigher<Map> {
    INSTANCE;

    @Override
    public int weightOf(Map values) {
      return values.size();
    }
  }
}
