/**
 * com.urise.webapp.model.Resume class
 */
public class Resume {

    private String uuid;

    @Override
    public String toString() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUuid() {
        return uuid;
    }

}