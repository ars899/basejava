import java.util.Arrays;

public class ArrayStorage {
    Resume[] storage = new Resume[10000];
    int size = 0;

    void clear() {
        Arrays.fill(storage, 0, size, null);
        size = 0;
    }

    void save(Resume r) {
        if (size == storage.length) {
            System.out.println("Все места заняты");
        } else
            storage[size] = r;
        size++;
    }

    
    void update(Resume resume) {
        int i = getIndex(resume.getUuid());
        if (i == -1) {
            System.out.println("Резюме " + resume.getUuid() + " не существует");
        } else {
            storage[i] = resume;
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

    private int getIndex(String uuid) {
        for (int i = 0; i < size; i++) {
            if (storage[i].getUuid().equals(uuid)) {
                return i;
            }
        }
        return -1;
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
        return 0;
    }
}