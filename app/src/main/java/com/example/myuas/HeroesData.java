package com.example.myuas;

import java.util.ArrayList;

class HeroesData {
    private static String[][] data = new String[][]{
            {"Laut Bercerita", "Laut Bercerita, novel terbaru Leila S. Chudori, bertutur tentang kisah keluarga yang kehilangan, sekumpulan sahabat yang merasakan kekosongan di dada, sekelompok orang yang gemar menyiksa dan lancar berkhianat, sejumlah keluarga yang mencari kejelasan makam anaknya, dan tentang cinta yang tak akan luntur.", "https://cdn.gramedia.com/uploads/items/9786024246945_Laut-Bercerita.jpg"},
            {"Rapijali 3: Kembali", "Delapan tahun berlalu. Ping telah berhasil menjadi penyanyi terkenal yang merajai percaturan musik Indonesia. Pada puncak kariernya, bayangan kelam mengintai kesuksesan Ping dan menggerogotinya dari dalam. Di titik terendahnya, Ping menemukan secercah kehidupan lama yang ia rindukan, termasuk kawan lamanya, Oding.", "https://cdn.gramedia.com/uploads/items/Cover_Depan_Rapijali_3.jpeg"},
            {"Selamat Tinggal", "Kita tidak sempurna. Kita mungkin punya keburukan, melakukan kesalahan, bahkan berbuat jahat, menyakiti orang lain. Tapi beruntunglah yang mau berubah. Berjanji tidak melakukannya lagi, memperbaiki, dan menebus kesalahan tersebut.", "https://cdn.gramedia.com/uploads/items/selamat_tinggal.jpg"},
            {"Selamat Tinggal Jogja", "Seorang gadis bernama Raiza yang baru saja mengalami patah hati karena hut‘uingannya dengan seorang pria bernama HaFiz berhenti di tengah jalan. Ibunya HaFiz beranggapan bahwa Raiza memiliki latar belakang keluarga yang sangat buruk. Raiza pun pergi ke kota Yogyakarta dan tinggal di kos sepupunya, UIFa. ", "https://cdn.gramedia.com/uploads/items/img20210621_16591298.jpg"},
    };

    static ArrayList<Hero> getListData(){
        ArrayList<Hero> list = new ArrayList<>();
        for (String[] aData : data) {
            Hero hero = new Hero();
            hero.setName(aData[0]);
            hero.setFrom(aData[1]);
            hero.setPhoto(aData[2]);

            list.add(hero);
        }

        return list;
    }
}