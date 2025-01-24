package mapStruct.builder;

public class Person {

    private final String name;
    private final int id;

    protected Person(Person.Builder builder){
        this.name = builder.name;
        this.id = builder.id;
    }

    public static Person.Builder builder(){
        return new Person.Builder();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static class Builder{
        private String name;
        private int id;
        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder id(int id){
            this.id = id;
            return this;
        }

        public Person create(){
            return new Person(this);
        }
    }
}
