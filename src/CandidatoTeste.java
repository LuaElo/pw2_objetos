import java.time.LocalDate;

public class CandidatoTeste {
    public static void main(String[] args) {
        //Instanciar um objeto
        Candidato registro = new Candidato();
        registro.nome = "Eloah e Luara ";
        registro.email = "eloahluaraa@gmaiul.com";
        registro.datadenascimento = LocalDate.of(2006, 8, 19 );
        registro.escolaridade = "ensino medio";
        registro.celular = " (11) 989054966";
        registro.funcao = "trabalhador";
        registro.pretensaosalarial = 2000;
        registro.estaempregado = true;
        registro.aceitaestagio = false;

    }
}
