package av1;

public class Paciente {
    String nome;
    double peso;
    double altura;

    Paciente(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public double calcularIMC() {
        return this.peso / (this.altura * this.altura);
    }

    public String diagnostico() {
        double imc = this.calcularIMC();
        
        if (imc < 16) {
            return "Baixo peso muito grave = IMC abaixo de 16 kg/m²";
        } else if (imc < 17) {
            return "Baixo peso grave = IMC entre 16 e 16,99 kg/m²";
        } else if (imc < 18.5) {
            return "Baixo peso = IMC entre 17 e 18,49 kg/m²";
        } else if (imc < 25) {
            return "Peso normal = IMC entre 18,50 e 24,99 kg/m²";
        } else if (imc < 30) {
            return "Sobrepeso = IMC entre 25 e 29,99 kg/m²";
        } else if (imc < 35) {
            return "Obesidade grau I = IMC entre 30 e 34,99 kg/m²";
        } else {
            return "Obesidade grau II (obesidade mórbida) = IMC igual ou maior que 35 kg/m²";
        }
    }
}