package org.srplib.model;

/**
 * General purpose and context independent model abstraction.
 *
 * <p>Isolates value consumer from value provider. Make it possible to implement technology independent libraries such as
 * binding, validation, etc.</p>
 *
 * @author Anton Pechinsky
 */
public interface ValueModel<T> {

    /**
     * Set model value.
     *
     * @param value new model value
     */
    void setValue(T value);

    /**
     * Returns current model value.
     *
     * @return value of model.
     */
    T getValue();

    /**
     * Returns type of value.
     *
     * @return Class value class or {@code null} if type is unknown.
     */
    Class<T> getType();

}
