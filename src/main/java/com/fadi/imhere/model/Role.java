package com.fadi.imhere.model;

import lombok.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "roles")
public class Role implements Serializable {


    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "description")
    private String description;


}
