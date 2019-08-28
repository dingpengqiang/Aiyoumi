package com.noway.cook.model.secondary;

import lombok.Data;

import javax.persistence.*;

/**
 * @author noway
 */
@Data
@Entity
@Table(name = "f_banner")
public class Banner {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String image;

    private String title;

    private String url;

    private String urlType;

    private String endpoint;

    private String position;

    private String remark;


}
