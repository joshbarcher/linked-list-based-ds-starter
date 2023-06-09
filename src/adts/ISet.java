package adts;

import java.util.NoSuchElementException;

/**
 * Represents a set of unique elements. No duplicates will be
 * allowed. The set should grow to accommodate any number of
 * elements.
 *
 * DO NOT EDIT THIS FILE!
 *
 * @author Josh Archer
 * @version 1.0
 */
public interface ISet<T> extends ICollection<T>
{
    /**
     * Adds an element to the collection, as long as the element
     * is not already present in the structure.
     *
     * @param element the element to add
     * @throws IllegalArgumentException if the input element is a
     *         duplicate of an existing element in the set
     */
    void add(T element);

    /**
     * Adds several elements to the set. No duplicate elements
     * should be added to the set.
     *
     * Note: If you are unfamiliar with variable-length parameters
     * then review the following tutorial:
     * (https://www.programiz.com/java-programming/varargs)
     *
     * @param elements the elements to add to the set
     * @throws IllegalStateException if any of the input elements
     *         are duplicates of an existing element in the set
     *         or another element in the parameters
     */
    void addAll(T... elements);

    /**
     * Removes several elements from the set. This method should
     * behave as a transaction, where all elements are removed
     * or none are.
     *
     * Note: If you are unfamiliar with variable-length parameters
     * then review the following tutorial:
     * (https://www.programiz.com/java-programming/varargs)
     *
     * @param elements the elements to add to the set
     * @throws NoSuchElementException if any of the input elements
     *         are notfound
     */
    void removeAll(T... elements);
}
