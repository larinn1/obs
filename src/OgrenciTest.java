public class OgrenciTest {
    public static void main(String[] args) {
        // Java da obje oluşturmak bu şekilde
        Ogrenci ogr = new Ogrenci();

        ogr.setNo(1);
        ogr.setAd("Larin");
        ogr.setSoyad("Celtik");
        ogr.setDogumYeri("Ankara");
        ogr.setHarc(1500);

        System.out.println(ogr.getNo() + "-" + ogr.getAd()+" " + ogr.getSoyad()
        + " " + ogr.getHarc());

        ogr.setHarc(2000);

        System.out.println(ogr.getNo() + "-" +ogr.getAd()+" "+
                ogr.getSoyad()+ " " +ogr.getHarc());

        ogr.setHarc(-500);

        System.out.println(ogr.getNo() + "-" +ogr.getAd()+" "
        +ogr.getSoyad()+ " " +ogr.getHarc());


        Ogrenci ogr2 = new Ogrenci(2, "Uğur", "Coşkun", "Türkiye", 5000);

        System.out.println(ogr2);






    }
}
