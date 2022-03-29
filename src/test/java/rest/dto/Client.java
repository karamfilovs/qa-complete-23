package rest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class Client {
  private String id;
  private String name;
  private String town;
  private String address;
  private boolean is_reg_vat;
  private String mol;
  private String bulstat;

    public static void main(String[] args) {
       Client client = new ClientBuilder()
               .address("Sofia")
               .mol("Ivan Ivanov")
               .is_reg_vat(false)
               .town("Sofia")
               .build();
    }
}


