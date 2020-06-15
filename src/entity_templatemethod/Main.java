/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity_templatemethod;

import java.util.GregorianCalendar;

/**
 *
 * @author Lân
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityDB svdb = new SinhVienDB();
        svdb.add(new SinhVien(59131178, "Nguyen Dinh Hoang Lan", new GregorianCalendar(1999, 11, 22), "Ha Noi"));
        svdb.add(new SinhVien(59131179, "Nguyen Dinh Lan", new GregorianCalendar(1999, 10, 21), "Ha Tinh"));
        svdb.add(new SinhVien(59131180, "Nguyen Hoang Lan", new GregorianCalendar(1999, 9, 20), "Ha Giang"));
        svdb.add(new SinhVien(59131181, "Nguyen Lan", new GregorianCalendar(1999, 8, 19), "Thanh Hoa"));
        svdb.add(new SinhVien(59131181, "Nguyen Cao", new GregorianCalendar(1999, 7, 18), "Thanh Hoa"));
        System.out.println(svdb.toString());
        
        svdb.delete(new SinhVien(59131178, "Nguyen Dinh Hoang Lan", new GregorianCalendar(1999, 11, 22), "Ha Noi"));
        System.out.println(svdb.toString());
        
        svdb.deleteByKey(59131180);
        System.out.println(svdb.toString());
        
        svdb.update(new SinhVien(59131179, "Funny Valentine", new GregorianCalendar(1999, 7, 4), "America"));
        System.out.println(svdb.toString());
        
        EntityDB mhdb = new MonHocDB();
    }
    
}
