package Sets.Exercicios.Entites;

import java.util.Date;
import java.util.Objects;

public class LogsEntry  {

    private String username;
    private Date moment;

    public LogsEntry(String username, Date moment) {
        this.username = username;
        this.moment = moment;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LogsEntry logsEntry)) return false;
        return getUsername().equals(logsEntry.getUsername());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsername());
    }


}
