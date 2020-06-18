package tekwill_java_basic;

public class CompareObjects {


    public static void main(String[] args) {
        Person person1 = new Person("Martin", 21, 65);
        Person person2 = new Person("Martin", 21, 65); //if we change one of value it's not will be equals

        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));
        System.out.println();

        //hash
        Simpson homer = new Simpson(1, "Homer");//Omer name
        Simpson bart = new Simpson(1, "Homer"); //id=2 hash will be diff and data will be diff

        boolean isHashcodeEquals = homer.hashCode() == bart.hashCode();

        if (isHashcodeEquals) {
            System.out.println("Should compare with equals method too.");
            System.out.println(homer.equals(bart));
        } else {
            System.out.println("Should not compare with equals method because " +
                    "the id is different, that means the objects are not equals for sure.");
        }


    }

    static class Person {
        private String name;
        private int age;
        private int weight;

        public Person(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public boolean equals(Person p) {
            return (p.name == name) && (p.age == age) && (p.weight == weight);
        }
    }


    static class Simpson {
        int id;
        String name;

        public Simpson(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Simpson simpson = (Simpson) o;
            return id == simpson.id &&
                    name.equals(simpson.name);
        }

        @Override
        public int hashCode() {
            return id;
        }
    }


}
