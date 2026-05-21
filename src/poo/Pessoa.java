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

    //Sobrecarga
    public Pessoa(String name){
        this.name = name;
        this.age = 0;
    }

    public void mostrarInfo(){
        System.out.println("Nome: " + name + " Idade: " + age);
    }

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Maria Eduarda", 25);
        Pessoa p2 = new Pessoa("Marcelo");
        Pessoa p3 = new Pessoa();

        p1.mostrarInfo();
        p2.mostrarInfo();
        p3.mostrarInfo();
    }
}
