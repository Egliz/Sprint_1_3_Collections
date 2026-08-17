package level_2.MultipleSorting;

import java.util.Objects;

    public class Restaurant {

        private String name;
        private int score;

        public Restaurant(String name, int score) {
            this.name = name;
            this.score = score;

        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            level_2.HashSetNoDuplicates.Restaurant that = (level_2.HashSetNoDuplicates.Restaurant) o;
            return score == that.score && Objects.equals(name, that.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, score);
        }

        @Override
        public String toString() {
            return "Restaurant{" +
                    "name='" + name + '\'' +
                    ", score=" + score +
                    '}';
        }
    }
