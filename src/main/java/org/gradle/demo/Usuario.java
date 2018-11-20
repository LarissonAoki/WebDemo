
package org.gradle.demo;
import org.bson.types.ObjectId;

public class Usuario {
    private ObjectId id;
    private String nome;
    private String telefone;

    public Usuario(ObjectId id, String nome, String telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

    public ObjectId getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
