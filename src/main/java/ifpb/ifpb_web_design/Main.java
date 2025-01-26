package ifpb.ifpb_web_design;

import bean.CGenUtil;
import models.HetraArrAnnee;
import models.PayementTaxe;
import models.VHetraAlohaMaison;
import utilitaire.UtilDB;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) throws Exception {
        int idmaison=1;
        int mois=1;
        int annee=2025;
        UtilDB utildb=new UtilDB();
        Connection connection= utildb.GetConn();
        VHetraAlohaMaison[] listsVhm= (VHetraAlohaMaison[])CGenUtil.rechercherCritere(new VHetraAlohaMaison(),"idmaison="+idmaison,connection).getResultat();
        PayementTaxe payementTaxe= new PayementTaxe();
        payementTaxe.setAnnee(annee);
        payementTaxe.setMois(mois);
        payementTaxe.setId_maison(idmaison);
        payementTaxe.setMontant(listsVhm[0].getHetra());

        payementTaxe.insertPayementTaxe(
                payementTaxe.getId_maison(),
                payementTaxe.getMontant(),
                payementTaxe.getMois(),
                payementTaxe.getAnnee(),
                connection
        );

        connection.close();
    }
}
