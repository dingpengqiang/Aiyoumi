package com.noway.cook.model.primary;


import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

/**
 * @author noway
 */
@Data
@Entity
@DynamicUpdate
@Table(name = "f_cook")
public class Cook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String title;

    private String image;

    private String type;

    @Column(name = "cook_type")
    private String cookType;

    @Column(name = "month_type")
    private String monthType;

    @Column(name = "function_type")
    private String functionType;

    private String content;

    @Column(name = "media_type")
    private String mediaType;

    private String remark;

    private Integer read;

    private Integer like;

    private Integer mark;
}
