import java.util.Arrays;

public class ArrayStorage {
    Resume[] storage = new Resume[10000];
    int size = 0;

    void clear() {
        Arrays.fill(storage, 0, size, null);
        size = 0;
    }

    void save(Resume r) {
        if (size < storage.length) {
            storage[size] = r;
            size++;
        }
    }

    Resume get(String uuid) {
        for (int i = 0; i < size; i++) {
            if (storage[i].uuid == uuid)
                return storage[i];
            /* Сравнивая запрашиваемое с тем что имеем в массиве и выводим его*/
        }
        return null; /* Если нет, то выводить null */
    }

    void delete(String uuid) {
        for (int i = 0; i < size; i++) {
            if (storage[i].uuid == uuid)
                storage[i] = storage[size - 1];
        }
        size--;

    }

    Resume[] getAll() {
        Resume[] storage = new Resume[size];
        return Arrays.copyOf(storage, size);
    }

    int size() {
        return size;
    }
}