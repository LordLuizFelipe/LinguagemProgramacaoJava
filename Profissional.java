class Profissional {
    private int id;
    private String nome;
    private String email;
    private double salario;

    public Profissional(int id, String nome, String email, double salario) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
