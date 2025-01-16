package tests.classwork.api;

import java.util.Objects;

public class Search {

    String user = "";
    boolean strict;

    public Search(String user, boolean strict) {
        this.user = user;
        this.strict = strict;
    }

    public Search() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public boolean isStrict() {
        return strict;
    }

    public void setStrict(boolean strict) {
        this.strict = strict;
    }

    public String toString() {
        return "tests.classwork.api.Search{" +
                "user='" + user + '\'' +
                ", strict=" + strict +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Search search = (Search) o;
        return strict == search.strict && Objects.equals(user, search.user);
    }

    public int hashCode() {
        return Objects.hash(user, strict);
    }
}
