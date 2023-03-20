package Pres;

import Dao.dao.IDao;

import java.io.File;
import java.util.Scanner;

public class PresDynamique {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(new File("config.txt"));
        String daoMaclasse=scanner.nextLine();
        Class cDao=Class.forName(daoMaclasse);
        IDao dao =(IDao) cDao.newInstance();
        System.out.println(dao.getData());

    }
}
