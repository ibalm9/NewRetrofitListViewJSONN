package info.camposha.retrofitlistviewjson.models;

import com.google.gson.annotations.SerializedName;

public class Spacecraft {



        @SerializedName("id")
        private int id;
        @SerializedName("nama")
        private String nama;
        @SerializedName("foto")
        private String foto;


        public Spacecraft(int id, String nama, String imageURL) {
            this.id = id;
            this.nama = nama;
            this.foto = foto;
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



        @Override
        public String toString() {
            return nama;
        }


}
