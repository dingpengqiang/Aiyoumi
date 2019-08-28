package com.noway.cook.model.secondary;


import lombok.Data;

import javax.persistence.*;

/**
 * @author noway
 */
@Data
@Entity
@Table(name = "f_option")
public class Option {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    /**
     *  TODO
     *  用该注解 Column替换关键字
     */
    @Column(name = "class")
    private String clz;

    private String key;

    private String value;

    private String displayOrder;

    private String remark;
}
