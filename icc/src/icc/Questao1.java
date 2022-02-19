package icc;

public class Questao1 {
public static void main(String[] args) {
String nome = "Apolo"; //Substitua pelo seu primeiro nome (não use acentos)
int senha = (int)nome.toUpperCase().charAt(0) - 64;
senha = senha/8;
senha++;
System.out.println(senha);
}
}