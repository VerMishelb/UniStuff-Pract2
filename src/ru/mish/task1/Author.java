package ru.mish.task1;

class Author {
    String name;
    String email;
    char gender;

    Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public char getGender() {
        return gender;
    }
    public void setEmail(String email){
        this.email = email;
    }
    @Override public String toString() {
        return name + '(' + gender + ", " + email + ')';
    }
}
