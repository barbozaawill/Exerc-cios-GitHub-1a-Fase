import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        class Pessoa {
            public int idade;
            public String nome;    
        }

        System.out.println("Digite a quantidade de alunos: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consumir a quebra de linha após nextInt()
        Pessoa[] alunos = new Pessoa[n]; // Alocar espaço para n alunos
        int maisQue20 = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome do aluno:");
            String nome = sc.nextLine();
            System.out.println("Digite a idade do aluno:");
            int idade = sc.nextInt();
            sc.nextLine(); // Consumir a quebra de linha após nextInt()
        
            Pessoa aluno = new Pessoa();
            aluno.idade = idade;
            aluno.nome = nome;

            alunos[i] = aluno;
        }   
        
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i].idade == 18) {
                System.out.printf("O aluno %s tem 18 anos\n", alunos[i].nome);
            } 
            if (alunos[i].idade >= 20) {
                maisQue20++;
            }
        }
        
        System.out.println(maisQue20 + " têm 20 anos ou mais");
        sc.close();
    }
}
