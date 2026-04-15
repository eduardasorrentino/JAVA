package aula05.q01;

public class Medico {
    public boolean trabalhaNoHospital;

    public Medico(boolean trabalhaNoHospital) {
        this.trabalhaNoHospital = trabalhaNoHospital;
    }

    public void tratarPaciente() {
        System.out.println("Médico tratando paciente.");
    }
}
