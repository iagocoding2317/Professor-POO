public class PrincipalProf {
    public static void main (String args[]){
        Professor p = new Professor(21313, "Diego", "Medicina");
        p.imprimir();

        p.setDepartamento("Engenharia de Pesca");
        p.setNome("Barros");
        p.setMatricula(22212);
        p.imprimir();
    }
}
