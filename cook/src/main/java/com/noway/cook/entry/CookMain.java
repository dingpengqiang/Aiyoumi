package com.noway.cook.entry;

import com.noway.cook.model.secondary.Banner;
import com.noway.cook.model.secondary.Option;
import lombok.Data;

import java.util.List;

/**
 * @author noway
 */


@Data
public class CookMain {


    private List<Banner> banners;

    private List<Option> options;

}
