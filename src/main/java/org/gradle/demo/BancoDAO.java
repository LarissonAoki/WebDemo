package org.gradle.demo;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import org.bson.Document;
import org.bson.types.ObjectId;

public class BancoDAO {
    MongoCollection<Document> colecao;
    MongoDatabase database;
    MongoClient mongoClient;
    
    public BancoDAO(){
        mongoClient = new MongoClient("localhost", 27017);
        
        database = mongoClient.getDatabase("DBlarissa");
        
        colecao = database.getCollection("Atividade");
    }
    
    public FindIterable<Document> listarProcurados(String nome){
        
        FindIterable<Document> documentos = colecao.find(eq("nome", nome));
        return documentos;
        
    }
    
    
        
}
