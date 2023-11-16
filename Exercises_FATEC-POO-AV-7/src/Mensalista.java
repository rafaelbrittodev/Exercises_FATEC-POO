public class Mensalista extends Empregado {
    private String cargo;

    // Construtor
    public Mensalista(String n, String e, String c) {
        super(n, e);
        cargo = c;

    }

    // Metodos de acesso
    public void set_cargo(String c) {
        cargo = c;
    }

    public String get_cargo() {
        return (cargo);
    }

    public void calcularSalario() {
        if (cargo.equals("Junior")) {
            salario = 2500;
        } else if (cargo.equals("Pleno")) {
            salario = 3500;
        } else if(cargo.equals("Senior")){
            salario = 5500;
        }
    }
}
