
package org.gradle.demo;

import com.mongodb.client.FindIterable;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Scanner;
import org.bson.Document;

import org.bson.types.ObjectId;



@WebServlet(name = "HelloServlet", urlPatterns = {"/hello"}, loadOnStartup = 1) 

public class HelloServlet extends HttpServlet {
    Scanner scan = new Scanner(System.in);                                                                                                                                                                                                                                                                                                                                                                                                  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        response.getWriter().print("Funcionou");  
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        String name = request.getParameter("name");
        BancoDAO bd = new BancoDAO();
        if (name == null) name = "Larissa";
        
        FindIterable<Document> listaBusca = bd.listarProcurados(name);
        
        List<Usuario> lista = new ArrayList();
        
        
        ObjectId id = null;
        String telefone = null;
        String nome = null;
        
        for(Document d: listaBusca){
            
            id = (ObjectId) d.get("_id");
            telefone = (String) d.get("telefone");
            nome = (String) d.get("nome");
           
            lista.add(new Usuario(id, nome, telefone));
            
        }
        
        request.setAttribute("lista", lista);
        
        request.getRequestDispatcher("response.jsp").forward(request, response); 

    }
}
