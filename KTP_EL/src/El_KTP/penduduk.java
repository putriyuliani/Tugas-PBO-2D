/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package El_KTP;

import java.util.ArrayList;
/**
 *
 * @author nurudinhasbullah
 */
public class penduduk {
   
    public static void main(String[] args) {
               ArrayList<HashMap<String, data>> data1 = new ArrayList<>();
        //DataPenduduk RT01
        HashMap<String, data> rt1 = new HashMap<>();
        rt1.put("201611", new data("Adi      ", "Frozenland", "16/03/1993", "Laki-Laki", "AB", "RT01", "Ds. Konoha", "Islam", "Belum Kawin", "Guru     ", "WNI", "Seumur Hidup"));
        rt1.put("201612", new data("Samsul   ", "Frozenland", "11/11/1993", "Laki-Laki", "B ", "RT01", "Ds. Konoha", "Islam", "Belum Kawin", "Swasta   ", "WNI", "Seumur Hidup"));
        rt1.put("201613", new data("Johanes  ", "Frozenland", "12/12/1998", "Laki-Laki", "AB", "RT01", "Ds. Konoha", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt1.put("201614", new data("Mulyadi  ", "Frozenland", "15/07/1992", "Laki-Laki", "B ", "RT01", "Ds. Konoha", "Islam", "Belum Kawin", "Swasta   ", "WNI", "Seumur Hidup"));
        rt1.put("201614", new data("Paijo    ", "Frozenland", "12/08/1994", "Laki-Laki", "AB", "RT01", "Ds. Konoha", "Islam", "Belum Kawin", "Guru     ", "WNI", "Seumur Hidup"));
        rt1.put("201615", new data("Paiman   ", "Frozenland", "19/04/1994", "Laki-Laki", "AB", "RT01", "Ds. Konoha", "Islam", "Belum Kawin", "Swasta   ", "WNI", "Seumur Hidup"));
        data1.add(rt1);
        
        //Data Penduduk RT02
        HashMap<String, El_KTP.data> rt2 = new HashMap<>();
        rt2.put("202611", new El_KTP.data("Muhammad ", "Frozenland", "16/03/1998", "Laki-Laki", "AB", "RT02", "Ds. Konoha", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt2.put("202612", new El_KTP.data("Sudirman ", "Frozenland", "12/04/1991", "Laki-Laki", "B ", "RT02", "Ds. Konoha", "Islam", "Kawin      ", "Swasta   ", "WNI", "Seumur Hidup"));
        rt2.put("202613", new El_KTP.data("Yolanda  ", "Frozenland", "18/05/1998", "Perempuan", "AB", "RT02", "Ds. Konoha", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt2.put("202614", new El_KTP.data("Meloadi  ", "Frozenland", "26/04/1995", "Perempuan", "B ", "RT02", "Ds. Konoha", "Islam", "Kawin      ", "Swasta   ", "WNI", "Seumur Hidup"));
        rt2.put("202614", new El_KTP.data("Pairan   ", "Frozenland", "26/07/1998", "Laki-Laki", "AB", "RT02", "Ds. Konoha", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt2.put("202615", new El_KTP.data("Paimo    ", "Frozenland", "15/02/1989", "Laki-Laki", "AB", "RT02", "Ds. Konoha", "Islam", "Kawin      ", "Swasta   ", "WNI", "Seumur Hidup"));
        data1.add(rt2);

        System.out.println("Data Penduduk Desa Konoha RT 01 :");
        System.out.println(data1.get(0).get("201611").nama + " " + data1.get(0).get("201611").tmpL + " " + data1.get(0).get("201611").tglL + " " + data1.get(0).get("201611").jenKel + " " + data1.get(0).get("201611").golDar + " " + data1.get(0).get("201611").rt + " " + data1.get(0).get("201611").desa + " " + data1.get(0).get("201611").agama + " " + data1.get(0).get("201611").statusK + " " + data1.get(0).get("201611").kerja + " " + data1.get(0).get("201611").negara + " " + data1.get(0).get("201611").msLaku);
        System.out.println(data1.get(0).get("201612").nama + " " + data1.get(0).get("201612").tmpL + " " + data1.get(0).get("201612").tglL + " " + data1.get(0).get("201612").jenKel + " " + data1.get(0).get("201612").golDar + " " + data1.get(0).get("201612").rt + " " + data1.get(0).get("201612").desa + " " + data1.get(0).get("201612").agama + " " + data1.get(0).get("201612").statusK + " " + data1.get(0).get("201612").kerja + " " + data1.get(0).get("201612").negara + " " + data1.get(0).get("201612").msLaku);
        System.out.println(data1.get(0).get("201613").nama + " " + data1.get(0).get("201613").tmpL + " " + data1.get(0).get("201613").tglL + " " + data1.get(0).get("201613").jenKel + " " + data1.get(0).get("201613").golDar + " " + data1.get(0).get("201613").rt + " " + data1.get(0).get("201613").desa + " " + data1.get(0).get("201613").agama + " " + data1.get(0).get("201613").statusK + " " + data1.get(0).get("201613").kerja + " " + data1.get(0).get("201613").negara + " " + data1.get(0).get("201613").msLaku);
        System.out.println(data1.get(0).get("201614").nama + " " + data1.get(0).get("201614").tmpL + " " + data1.get(0).get("201614").tglL + " " + data1.get(0).get("201614").jenKel + " " + data1.get(0).get("201614").golDar + " " + data1.get(0).get("201614").rt + " " + data1.get(0).get("201614").desa + " " + data1.get(0).get("201614").agama + " " + data1.get(0).get("201614").statusK + " " + data1.get(0).get("201614").kerja + " " + data1.get(0).get("201614").negara + " " + data1.get(0).get("201614").msLaku);
        System.out.println(data1.get(0).get("201615").nama + " " + data1.get(0).get("201615").tmpL + " " + data1.get(0).get("201615").tglL + " " + data1.get(0).get("201615").jenKel + " " + data1.get(0).get("201615").golDar + " " + data1.get(0).get("201615").rt + " " + data1.get(0).get("201615").desa + " " + data1.get(0).get("201615").agama + " " + data1.get(0).get("201615").statusK + " " + data1.get(0).get("201615").kerja + " " + data1.get(0).get("201615").negara + " " + data1.get(0).get("201615").msLaku);

        System.out.println("Data Penduduk Desa Konoha RT 02 :");
        System.out.println(data1.get(1).get("202611").nama + " " + data1.get(1).get("202611").tmpL + " " + data1.get(1).get("202611").tglL + " " + data1.get(1).get("202611").jenKel + " " + data1.get(1).get("202611").golDar + " " + data1.get(1).get("202611").rt + " " + data1.get(1).get("202611").desa + " " + data1.get(1).get("202611").agama + " " + data1.get(1).get("202611").statusK + " " + data1.get(1).get("202611").kerja + " " + data1.get(1).get("202611").negara + " " + data1.get(1).get("202611").msLaku);
        System.out.println(data1.get(1).get("202612").nama + " " + data1.get(1).get("202612").tmpL + " " + data1.get(1).get("202612").tglL + " " + data1.get(1).get("202612").jenKel + " " + data1.get(1).get("202612").golDar + " " + data1.get(1).get("202612").rt + " " + data1.get(1).get("202612").desa + " " + data1.get(1).get("202612").agama + " " + data1.get(1).get("202612").statusK + " " + data1.get(1).get("202612").kerja + " " + data1.get(1).get("202612").negara + " " + data1.get(1).get("202612").msLaku);
        System.out.println(data1.get(1).get("202613").nama + " " + data1.get(1).get("202613").tmpL + " " + data1.get(1).get("202613").tglL + " " + data1.get(1).get("202613").jenKel + " " + data1.get(1).get("202613").golDar + " " + data1.get(1).get("202613").rt + " " + data1.get(1).get("202613").desa + " " + data1.get(1).get("202613").agama + " " + data1.get(1).get("202613").statusK + " " + data1.get(1).get("202613").kerja + " " + data1.get(1).get("202613").negara + " " + data1.get(1).get("202613").msLaku);
        System.out.println(data1.get(1).get("202614").nama + " " + data1.get(1).get("202614").tmpL + " " + data1.get(1).get("202614").tglL + " " + data1.get(1).get("202614").jenKel + " " + data1.get(1).get("202614").golDar + " " + data1.get(1).get("202614").rt + " " + data1.get(1).get("202614").desa + " " + data1.get(1).get("202614").agama + " " + data1.get(1).get("202614").statusK + " " + data1.get(1).get("202614").kerja + " " + data1.get(1).get("202614").negara + " " + data1.get(1).get("202614").msLaku);
        System.out.println(data1.get(1).get("202615").nama + " " + data1.get(1).get("202615").tmpL + " " + data1.get(1).get("202615").tglL + " " + data1.get(1).get("202615").jenKel + " " + data1.get(1).get("202615").golDar + " " + data1.get(1).get("202615").rt + " " + data1.get(1).get("202615").desa + " " + data1.get(1).get("202615").agama + " " + data1.get(1).get("202615").statusK + " " + data1.get(1).get("202615").kerja + " " + data1.get(1).get("202615").negara + " " + data1.get(1).get("202615").msLaku);

    }
}
 
}
