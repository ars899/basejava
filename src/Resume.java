/**
 * com.urise.webapp.model.Resume class
 */
public class Resume {


    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUuid() {
        return uuid;
    }

    private String uuid;

    @Override
    public String toString() {
        return uuid;
    }
}