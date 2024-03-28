package av1;

public class Principal {
    public static void main(String[] args) {
        Paciente p1 = new Paciente("Rayanne", 56.7, 1.67);
        Paciente p2 = new Paciente("Hellen", 56, 1.63);
        Paciente p3 = new Paciente("Manuela", 43, 1.59);
    
        System.out.printf("Paciente: %s \nIMC: %.2f \nDiagnóstico: %s\n", p1.getNome(), p1.calcularIMC(), p1.diagnostico());
		System.out.printf("Paciente: %s \nIMC: %.2f \nDiagnóstico: %s\n", p2.getNome(), p2.calcularIMC(), p2.diagnostico());
        System.out.printf("Paciente: %s \nIMC: %.2f \nDiagnóstico: %s\n", p3.getNome(), p3.calcularIMC(), p3.diagnostico());
    }
}