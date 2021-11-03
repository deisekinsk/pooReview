package entities;

public class Product {

     private Long id;
     private String name;
     private Double price;
     private String description;
     private String imageUri;

     public Product(){

     }

     public Product(Long id, String name, Double price, String description, String imageUri) {
          this.id = id;
          this.name = name;
          this.price = price;
          this.description = description;
          this.imageUri = imageUri;
     }

     @Override
     public String toString() {
          return "Product{" +
                  "id=" + id +
                  ", name='" + name + '\'' +
                  ", price=" + price +
                  ", description='" + description + '\'' +
                  ", imageUri='" + imageUri + '\'' +
                  '}';
     }

     public void setId(Long id) {
          this.id = id;
     }

     public Long getId() {
          return id;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getName() {
          return name;
     }

     public void setPrice(Double price) {
          this.price = price;
     }

     public Double getPrice() {
          return price;
     }

     public void setDescription(String description) {
          this.description = description;
     }

     public String getDescription() {
          return description;
     }

     public void setImageUri(String imageUri) {
          this.imageUri = imageUri;
     }

     public String getImageUri() {
          return imageUri;
     }


}

