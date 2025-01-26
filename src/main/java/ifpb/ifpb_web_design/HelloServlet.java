package ifpb.ifpb_web_design;

import bean.CGenUtil;
import models.PayementTaxe;
import models.VHetraAlohaMaison;
import utilitaire.UtilDB;

import java.io.*;
import java.sql.Connection;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
        String maison = req.getParameter("maison");
        String moisAnnee = req.getParameter("moisAnnee");

        // Traitement des données (exemple : affichage dans la console)
        System.out.println("Maison sélectionnée : " + maison);
        System.out.println("Mois et Année : " + moisAnnee);

        int[] dateComponents = parseDateString(moisAnnee);

        // Afficher les résultats
        int annee = dateComponents[0];
        int mois = dateComponents[1];
        System.out.println("Année : " + annee);
        System.out.println("Mois : " + mois);
        UtilDB utildb=new UtilDB();
        Connection connection= utildb.GetConn();
        VHetraAlohaMaison[] listsVhm= (VHetraAlohaMaison[]) CGenUtil.rechercherCritere(new VHetraAlohaMaison(),"idmaison="+maison,connection).getResultat();
        PayementTaxe payementTaxe= new PayementTaxe();
        payementTaxe.setAnnee(annee);
        payementTaxe.setMois(mois);
        payementTaxe.setId_maison(Integer.parseInt(maison));
        payementTaxe.setMontant(listsVhm[0].getHetra());

            payementTaxe.insertPayementTaxe(
                    payementTaxe.getId_maison(),
                    payementTaxe.getMontant(),
                    payementTaxe.getMois(),
                    payementTaxe.getAnnee(),
                    connection
            );
        connection.close();

            String contextPath = req.getContextPath();

            // Construire l'URL de redirection en utilisant le contexte
            String redirectUrl = contextPath + "/pages/details-maison-mois.jsp?idmaison="+maison; // Rediriger vers page.jsp dans le même contexte

            // Effectuer la redirection
            resp.sendRedirect(redirectUrl);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public  int[] parseDateString(String dateString) {
        // Diviser la chaîne en utilisant le séparateur "-"
        String[] parts = dateString.split("-");

        // Convertir les parties en entiers
        int annee = Integer.parseInt(parts[0]); // Première partie : année
        int mois = Integer.parseInt(parts[1]); // Deuxième partie : mois

        // Retourner les résultats dans un tableau
        return new int[]{annee, mois};
    }
    public void destroy() {
    }
}