package poo;

public class Pessoa {
    String name;
    int age;

    //Construtor sem parâmetros
    public Pessoa(){
        this.name = "Sem nome";
        this.age = 0;
    }


    //Construtor parametrizado
    public Pessoa(String name, int age){
        this.name = name;
        this.age = age;
    }

    
}
