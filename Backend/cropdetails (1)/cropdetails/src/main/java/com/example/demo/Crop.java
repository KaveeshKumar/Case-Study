package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;


@Document(collection = "Crops")
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Data
public class Crop {
    @Transient
    private static final String SEQUENCE_Name="Crops_Sequence";
    @MongoId
    private String id;
    private String farmerid;
    private String name;
    private int cost;
    private int quantity;
    private String type;

}