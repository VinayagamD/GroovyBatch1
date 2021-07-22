

class  Person {

    def firstName
    def lastName

    def Person(String firstName, String lastName){
        this.firstName = firstName
        this.lastName = lastName
    }

    String toString(){
        return "Person {" +
            "firstName = " + firstName+
            "lastName = " + lastName+
        "}"
    }
}