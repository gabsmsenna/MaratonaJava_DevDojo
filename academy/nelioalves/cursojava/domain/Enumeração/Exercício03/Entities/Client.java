package academy.nelioalves.cursojava.domain.Enumeração.Exercício03.Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    private String nome;
    private String email;
    private Date birthDate;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append("Client: " + this.nome + " ");
       sb.append(sdf.format(this.birthDate) + " ");
       sb.append(this.email);
        return sb.toString();
    }

    public Client(String nome, String email, Date birthDate) {
        this.nome = nome;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
