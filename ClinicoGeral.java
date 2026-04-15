package aula05.q01;

public class ClinicoGeral extends Medico {
    public boolean atendeEmCasa;

    public ClinicoGeral(boolean trabalhaNoHospital, boolean atendeEmCasa) {
        super(trabalhaNoHospital);
        this.atendeEmCasa = atendeEmCasa;
    }

    public void receitar() {
        System.out.println("Clínico Geral receitando medicamento ao paciente.");
    }

    @Override
    public void tratarPaciente() {
        System.out.println("Clínico Geral tratando paciente.");
    }
}
