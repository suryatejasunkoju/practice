package com.practise.surya_practise.LLD.design_patterns.behavioural.state;

import lombok.Data;

@Data
public class ItemShelf {
    int code;
    Item item;
    boolean soldOut;
}
