import java.util.Arrays;

public class ArrayStorage {
    Resume[] storage = new Resume[10000];
    int size = 0;

    void clear() {
        Arrays.fill(storage, 0, size, null);
        int size = 0;
    }

    void save(Resume r) {

    }

    Resume get(String uuid) {
        return null;
    }

    void delete(String uuid) {

    }

    Resume[] getAll() {
        return new Resume[0];
    }

    int size() {
        return 0;
    }
}
