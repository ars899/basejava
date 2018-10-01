import java.util.Arrays;

public class ArrayStorage {
    Resume[] storage = new Resume[10_000];
    int size = 0;

    void clear() {
        Arrays.fill(storage, 0, size, null);
        size = 0;
    }

    void save(Resume resume) {
        if (getIndex(resume.getUuid()) != -1) {
            System.out.println("Такое резюме уже хранится в базе");
        } else if (size == storage.length) {
            System.out.println("Все места заняты");
        } else {
            storage[size] = resume;
            size++;
        }
    }

    void update(Resume r) {
        int i = getIndex(r.getUuid());
        if (i == -1) {
            System.out.println("Такого резюме не существует.");
        } else {
            storage[i] = r;
        }
    }

    Resume get(String uuid) {
        int i = getIndex(uuid);
        if (i == -1) {
            System.out.println("Такого резюме не существует.");
            return null;
        } else {
            return storage[i];
        }
    }

    void delete(String uuid) {
        int i = getIndex(uuid);
        if (i == -1) {
            System.out.println("Такого резюме не существует.");
        } else {
            storage[i] = storage[size - 1];
            storage[size - 1] = null;
            size--;
        }

    }

    Resume[] getAll() {
        return Arrays.copyOf(storage, size);
    }

    int size() {
        return size;
    }

    private int getIndex(String uuid) {
        for (int i = 0; i < size; i++) {
            if (storage[i].getUuid().equals(uuid)) {
                return i;
            }
        }
        return -1;
    }
}