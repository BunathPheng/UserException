package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Locale;
import java.util.UUID;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    private String uuid;
    private Integer qty;
    private Double price;
    private String date;

}
