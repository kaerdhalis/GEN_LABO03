import java.util.Objects;

public class Square {

    private String name;

    /**
     *
     * @param name nom de la case
     */
    public Square(String name) {
        this.name = name;
    }

    /**
     *
     * @return nom de la case
     */
    public String getName() {
        return name;
    }

    /**
     * redefinition equals
     * @param o object a comparer
     * @return si objects egaux
     */
    @Override
    public boolean equals(Object o) {

        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Square)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        Square c = (Square) o;

        // Compare the data members and return accordingly
        return name.equals(c.getName());

    }

    /**
     * redefinition du hash
     * @return hash de l'object
     */
        @Override
        public int hashCode() {
            return Objects.hash(name);
        }


}
