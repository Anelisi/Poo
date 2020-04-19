public class ProjetoPessoas {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 =new Funcionario();

        p1.setNome("Arthur");
        p2.setNome("Agli");
        p3.setNome("Anelisi");
        p4.setNome("Eliane");

        p2.setSexo("F");
        p3.setSexo("F");
        p3.setIdade(33);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }
}
