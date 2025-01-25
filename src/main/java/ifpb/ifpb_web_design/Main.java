package ifpb.ifpb_web_design;

import bean.CGenUtil;
import models.HetraArrAnnee;
import utilitaire.UtilDB;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) throws Exception {
        UtilDB utildb=new UtilDB();
        Connection connection= utildb.GetConn();
        HetraArrAnnee[] lists=(HetraArrAnnee[]) CGenUtil.rechercherCritere(new HetraArrAnnee(), "1<2" , connection).getResultat();
        connection.close();
    }
}
