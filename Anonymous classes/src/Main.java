public class Main {
    public static void main(String[] args) {

        Person nano = new Person("nano","attack", 8);
        Person manager = new Person(" John", "Smith", 42){
            // Anonymous classes are anonymous because they have no name! also they can override methods from classes such as Person :D
            @Override
            public String getFullName() {
                return "Manager" + super.getFullName();
            }
        };
        System.out.println(manager.getFullName());
        System.out.println(nano.getFullName());
    }
}