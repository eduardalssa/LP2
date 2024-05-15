package lp2g17.biblioteca;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private Calendar dataNascimento;

    public Pessoa(String nome, String sobrenome, Calendar dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getDataNascimentoString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(dataNascimento.getTime());
    }

    public String toString() {
        return "Nome: " + nome + System.lineSeparator() +
               "Sobrenome: " + sobrenome + System.lineSeparator() +
               "Data de Nascimento: " + getDataNascimentoString() + System.lineSeparator();
    }
}
