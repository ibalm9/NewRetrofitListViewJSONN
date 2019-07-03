package info.camposha.retrofitlistviewjson.models;

import com.google.gson.annotations.SerializedName;

public class Spacecraft {



        @SerializedName("id")
        private int id;
        @SerializedName("nama")
        private String nama;
        @SerializedName("foto")
        private String foto;
        @SerializedName("year")
        private int year;
        @SerializedName("club")
        private String club;
        @SerializedName("foot")
        private String foot;
        @SerializedName("deskripsi")
         private String deskripsi;


        public Spacecraft(int id, String nama, String imageURL, String year, String club, String foot, String deskripsi) {
            this.id = id;
            this.nama = nama;
            this.foto = foto;

            this.club = club;
            this.foot = foot;
            this.deskripsi = deskripsi;
        }


        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getName() {
            return nama;
        }
        public void setName(String name) {
            this.nama = name;
        }
        public String getImageURL() {
            return foto;
        }

        public String getClub() {
        return club;
    }
        public String getFoot() {
        return foot;
    }
        public String getDeskripsi() {
        return deskripsi;
    }



        @Override
        public String toString() {
            return nama;
        }


}
