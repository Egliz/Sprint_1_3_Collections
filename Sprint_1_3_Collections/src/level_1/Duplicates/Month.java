package level_1.Duplicates;

public class Month {
    private final String name;

    public Month(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("The month name cannot be null or blank.");
        }
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Month))
            return false;
        Month otherMonth = (Month) obj;
        return this.name.equals(otherMonth.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
