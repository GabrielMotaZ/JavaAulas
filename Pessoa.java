public class Pessoa {
    String nome;
    int idade;
    float peso;
    float altura;

    public float CalcularIMC() {
        return this.peso / (this.altura * this.altura);
    }
}
