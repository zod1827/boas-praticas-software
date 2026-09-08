public class Sistema {
    
    public static double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }
    
    public static String verificarSituacao(double media) {
        return media >= 6 ? "Aprovado" : "Reprovado";
    }
    
    public static void exibirResultados(String nome, double media, String situacao) {
        System.out.println("Aluno: " + nome);
        System.out.println("Media: " + media);
        System.out.println(situacao);
    }

    public static void main(String[] args) {
        String nomeAluno = "Carlos";
        double primeiraNota = 8;
        double segundaNota = 7;
        
        double media = calcularMedia(primeiraNota, segundaNota);
        String situacao = verificarSituacao(media);
        
        exibirResultados(nomeAluno, media, situacao);
    }
}